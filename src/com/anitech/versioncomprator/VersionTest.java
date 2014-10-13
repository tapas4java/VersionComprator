package com.anitech.versioncomprator;

/**
 * @author Tapas
 *
 */
public class VersionTest {
	
	private static VersionComprator cmp;

	/**
	 * 
	 * @param args
	 * @see formats: "1.1.2", "1.2", "1.2.0", "1.2.1", "1.12", "1.3", "1.3a", "1.3b", "1.3-SNAPSHOT"
	 */
	public static void main(String[] args) {
		cmp = new VersionComprator();
		
		int result = cmp.compare("1.4.0", "1.4.0-SNAPSHOT");
		System.out.println("Result===>"+result);
        
	}

}
