
def solve(list: List[Int]): Option[Int] = {
  list match {
    case Nil => None
    case x :: Nil => Some(0)
    case x :: xs => sequence((0 until x).toList.map(m => solve(xs.drop(m)).map(p => p + 1))).map(_.min)
  }
}

def sequence[T](list: List[Option[T]]): Option[List[T]] = {
  val col = list.collect { case Some(s) => s }
  col match {
    case Nil => None
    case _ => Some(col)
  }
}