package cc.mallet.pipe.tsf.transform;

public interface TokenTransformer {

	/**
	 * Transform the given token to a defined String representation.
	 * 
	 * The token is considered rejected by the transformer when this
	 * returns null. For example, a transformer to convert the given
	 * token to lower case could reject punctuation marks or numbers.
	 * 
	 * @param token token to transform as String, i.e., its text 
	 * @return String representation of token after transformation
	 * 	or null if token is rejected. 
	 */
	public String transform(String token);

}
