package list

/**
  * @author Yuriy Tumakha
  */
trait LinkedList[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: LinkedList[T]
  def ::[E >: T](elem: E): LinkedList[E] = new Node(elem, this)
  def appendToTail[E >: T](elem: E): LinkedList[E] = head :: tail.appendToTail(elem)
}

case class Node[T](val head: T, val tail: LinkedList[T]) extends LinkedList[T] {
  def isEmpty = false
}

case object EmptyNode extends LinkedList[Nothing] {
  def isEmpty = true
  def head = throw new NoSuchElementException("EmptyNode.head")
  def tail = throw new NoSuchElementException("EmptyNode.tail")
  override def appendToTail[T](elem: T): LinkedList[T] = elem :: this
}

object LinkedList {

  def apply[T](items: T*): LinkedList[T] = {
    if (items.isEmpty) {
      EmptyNode
    } else {
      Node(items.head, apply(items.tail : _*))
    }
  }

}