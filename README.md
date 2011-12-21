My fork of [Mallet](http://mallet.cs.umass.edu/index.php), MAchine Learning for LanguagE Toolkit in java

Updated to last version: **2.0.7**, 2011-9-22

[Original mercurial repository](http://hg-iesl.cs.umass.edu/hg/mallet)'s history kept using [hg-git](http://hg-git.github.com/)


# Selected changes

* Improved documentation

* Pipes to get features from single tokens through transformations
  For example (TokenTransform) to convert to lower case or
  to convert to different morphologies, like U27k9 -> A11a1
  (cap num num low num)
  See package [cc.mallet.pipe.tsf.transform](https://github.com/jmcejuela/mallet/tree/master/src/cc/mallet/pipe/tsf/transform)
