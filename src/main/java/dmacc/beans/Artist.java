package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Artist {
	private String artistFirstName;
	private String artistLastName;
	
	public Artist() {
		super();
	}
	
	public Artist(String artistFirstName, String artistLastName) {
		this.artistFirstName = artistFirstName;
		this.artistLastName = artistLastName;
	}

	public String getFirstName() {
		return artistFirstName;
	}

	public void setFirstName(String artistFirstName) {
		this.artistFirstName = artistFirstName;
	}

	public String getLastName() {
		return artistLastName;
	}

	public void setLastName(String artistLastName) {
		this.artistLastName = artistLastName;
	}

	@Override
	public String toString() {
		return "Artist [artistFirstName=" + artistFirstName + ", artistLastName=" + artistLastName + "]";
	}


}
