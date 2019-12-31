package org.scilab.forge.jlatexmath.commands;

import org.scilab.forge.jlatexmath.Atom;
import org.scilab.forge.jlatexmath.BoldAtom;
import org.scilab.forge.jlatexmath.TeXParser;

public class CommandBold extends Command1A {

	@Override
	public Atom newI(TeXParser tp, Atom a) {
		return new BoldAtom(a);
	}

	@Override
	public Command duplicate() {
		return new CommandBold();
	}

}
