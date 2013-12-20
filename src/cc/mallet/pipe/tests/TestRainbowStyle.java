/* Copyright (C) 2002 Univ. of Massachusetts Amherst, Computer Science Dept.
   This file is part of "MALLET" (MAchine Learning for LanguagE Toolkit).
   http://www.cs.umass.edu/~mccallum/mallet
   This software is provided under the terms of the Common Public License,
   version 1.0, as published by http://www.opensource.org.  For further
   information, see the file `LICENSE' included with this distribution. */




/** 
   @author Andrew McCallum <a href="mailto:mccallum@cs.umass.edu">mccallum@cs.umass.edu</a>
 */

package cc.mallet.pipe.tests;

import junit.framework.*;
import java.net.URI;
import java.net.URL;
import java.io.File;
import java.util.Iterator;
import java.util.regex.*;

import cc.mallet.pipe.*;
import cc.mallet.pipe.iterator.*;
import cc.mallet.types.*;

public class TestRainbowStyle extends TestCase
{
	public TestRainbowStyle (String name) {
		super (name);
	}
	
	public void testThree ()
	{
		InstanceList il = new InstanceList (
			new SerialPipes (new Pipe[] {
				new Target2Label (),
				new CharSequence2TokenSequence (),
				new TokenSequenceLowercase (),
				new TokenSequenceRemoveStopwords (),
				new TokenSequence2FeatureSequence (),
				new FeatureSequence2FeatureVector ()
			}));
		Iterator<Instance> pi = new FileIterator (new File("foo/bar"), null, Pattern.compile("^([^/]*)/"));
		il.addThruPipe (pi);
	}

	public static Test suite ()
	{
		return new TestSuite (TestRainbowStyle.class);
	}

	protected void setUp ()
	{
	  /* XXX (Rick Warren 2013-06-06): Added missing setup line to make 
	   * testPlusEqualsFromSaved() pass.
	   */
	  new File("foo/bar").mkdirs();
	  // END modification 3013-06-06
	}

	public static void main (String[] args)
	{
		junit.textui.TestRunner.run (suite());
	}
	
}
