package org.scilab.forge.jlatexmath.commands;

import org.scilab.forge.jlatexmath.Atom;
import org.scilab.forge.jlatexmath.LapedAtom;
import org.scilab.forge.jlatexmath.TeXParser;

public class CommandLLap extends Command1A {

	@Override
	public Atom newI(TeXParser tp, Atom a) {
		return new LapedAtom(a, 'l');
	}

	@Override
	public Command duplicate() {
		return new CommandLLap();
	}

}
