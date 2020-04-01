package list

import org.scalatest.FunSuite

/**
  * @author Yuriy Tumakha
  */
class LinkedListTest extends FunSuite {

  test("Node") {
    // try with null instead of EmptyNode
    val node = new Node[Int](7, null)
    println(node)

    val node1 = new Node[Int](8, EmptyNode)
    println(node1)

    val node2 = new Node[Int](3, new Node[Int](4, new Node[Int](5, EmptyNode)))
    println(node2)
  }

  test("LinkedList") {
    val list = LinkedList(4, 5, 8, 9)
    println(list)
    assert(list.head === 4)
  }

  test("LinkedList ::") {
    val list = 1 :: 2 :: 3 :: EmptyNode
    println(list)
    assert(list.head === 1)
    assert(list.tail.head === 2)
  }

  test("LinkedList appendToTail") {
    val list = LinkedList(3, 6, 9)
    val list2 = list.appendToTail(10)
    println(list2)
    assert(list2.tail.tail.tail.head === 10)
  }

  test("Empty LinkedList") {
    val list = LinkedList()
    assert(list.isEmpty, "List should be empty")

    val list2 = list.appendToTail(1)
    println(list2)
    assert(list2.head === 1)
  }

}