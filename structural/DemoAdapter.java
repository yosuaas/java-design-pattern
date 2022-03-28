package structural;

import structural.adapter.SquarePegAdapter;
import structural.adapter.round.RoundHole;
import structural.adapter.round.RoundPeg;
import structural.adapter.square.SquarePeg;

public class DemoAdapter {
  static final double ROUND_HOLE = 3;
  static final double ROUND_PEG = 4;
  static final double SMALL_SQUARE_PEG = 4;
  static final double LARGE_SQUARE_PEG = 10;

  public static void main(String[] args) {

    RoundHole roundHole = new RoundHole(ROUND_HOLE);
    RoundPeg roundPeg = new RoundPeg(ROUND_PEG);
    if (roundHole.fits(roundPeg)) {
      System.out.println(
          "[V] Round peg radius: " + ROUND_PEG + " fits round hole radius: " + ROUND_HOLE);
    } else {
      System.out.println(
          "[X] Round peg radius: " + ROUND_PEG + " doesn't fit round hole radius: " + ROUND_HOLE);
    }

    SquarePeg smallSquarePeg = new SquarePeg(4);
    SquarePeg largeSquarePeg = new SquarePeg(10);

    SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
    SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

    if (roundHole.fits(smallSquarePegAdapter)) {
      System.out.println(
          "[V] Square peg with width: "
              + SMALL_SQUARE_PEG
              + " fits round hole radius: "
              + ROUND_HOLE);
    } else {
      System.out.println(
          "{X] Square peg with width: "
              + SMALL_SQUARE_PEG
              + " doesn't fit round hole radius: "
              + ROUND_HOLE);
    }

    if (roundHole.fits(largeSquarePegAdapter)) {
      System.out.println(
          "[V] Square peg with width: "
              + LARGE_SQUARE_PEG
              + " fits round hole radius: "
              + ROUND_HOLE);
    } else {
      System.out.println(
          "[X] Square peg with width: "
              + LARGE_SQUARE_PEG
              + " doesn't fit round hole radius: "
              + +ROUND_HOLE);
    }
  }
}
