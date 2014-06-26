package lib.scala.kikite

import com.mongodb.casbah
import fi.fimm.graph

object KIKite
{
	def terms: List[String] = { //returns a sorted list of all terms where each term has the format context.key
		val db = graph.Config.db
		val termColl = db.apply("terms")
		termColl.map(_.get("label").toString).toList.sortWith((x, y) => x < y)
	}
}
