package org.scilab.forge.jlatexmath.commands;

import org.scilab.forge.jlatexmath.Atom;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXParser;
import org.scilab.forge.jlatexmath.TypedAtom;

public class CommandMathPunct extends Command1A {

	@Override
	public Atom newI(TeXParser tp, Atom a) {
		return new TypedAtom(TeXConstants.TYPE_PUNCTUATION, a);
	}

	@Override
	public Command duplicate() {
		return new CommandMathPunct();
	}

}
