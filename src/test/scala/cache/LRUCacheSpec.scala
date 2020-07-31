package cache

import org.scalatest.{FlatSpec, Matchers}

/**
 * @author Yuriy Tumakha
 */
class LRUCacheSpec extends FlatSpec with Matchers {

  "LRUCache" should "work as Scala mutable Map" in {
    val cache = LRUCache[String, String](1000)
    val key = "key1"
    val value = "value1"

    cache.get(key) shouldBe None
    cache += key -> value
    cache.get(key) shouldBe Some(value)
    cache(key) shouldBe value
  }

}
