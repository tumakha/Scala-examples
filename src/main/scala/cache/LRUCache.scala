package cache
import java.util.Collections.synchronizedMap

import scala.collection.mutable
import scala.jdk.CollectionConverters._

/**
 * @author Yuriy Tumakha
 */
class LRUCache[K, V](maxEntries: Int)
  extends java.util.LinkedHashMap[K, V](100, .75f, true) {

  override def removeEldestEntry(eldest: java.util.Map.Entry[K, V]): Boolean = size > maxEntries

}

object LRUCache {
  def apply[K, V](maxEntries: Int): mutable.Map[K, V] = synchronizedMap(new LRUCache[K, V](maxEntries)).asScala
}
