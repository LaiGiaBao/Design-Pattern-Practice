package com.company.adapter_pattern;

import com.company.adapter_pattern.adapter.SquarePegAdapter;
import com.company.adapter_pattern.round.RoundHole;
import com.company.adapter_pattern.round.RoundPeg;
import com.company.adapter_pattern.square.SquarePeg;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		RoundHole hole = new RoundHole(5);
		RoundPeg rpeg = new RoundPeg(5);
		if(hole.fits(rpeg)) {
			System.out.println("Round peg fits round hole r5");
		}
		SquarePeg smallSqPeg = new SquarePeg(2);
		SquarePeg bigSqPeg = new SquarePeg(20);		
//		hole.fits(smallSqPeg); doesn't work
		
		SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
		SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(bigSqPeg);
		
		if(hole.fits(smallSqPegAdapter)) {
			System.out.println("Square peg w2 fits round hole r5");
		}
		if(!hole.fits(largeSqPegAdapter)) {
			System.out.println("Square peg w20 does not fit into round hole r5");
		}
	}
}
