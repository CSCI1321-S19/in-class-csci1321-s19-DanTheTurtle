package section2.drmario

class Pill(val cells: List[PillPiece]) extends BoardElement {
  def move(dx: Int,dy: Int): Pill = {
    new Pill(cells.map(pp => pp.move(dx,dy)))
  }
  def canMove(dx: Int, dy: Int): Boolean = {
    cells.forall(_.canMove(dx,dy))
  }
}