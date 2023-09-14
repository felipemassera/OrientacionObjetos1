package ar.edu.unlp.oo1.ejercicio1.impl;
import ar.edu.unlp.oo1.ejercicio1.WallPost;

public class WallPostImpl implements WallPost {

	private int likes;
	private String text;
	private boolean feature;
	
	public WallPostImpl () {
		this.likes = 0;
		this.text = "Undefined post";
		this.feature = false;
	}
	
	
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

    @Override
    public String getText(){
    	return this.text;
    }

	@Override
	public void setText(String text) {
		this.text = text;
		
	}


	@Override
	public int getLikes() {
		return this.likes;
	}


	@Override
	public void like() {
		this.likes = this.likes + 1;		
	}


	@Override
	public void dislike() {
		if (this.likes>0) {
			this.likes = this.likes - 1;			
		}
	}


	@Override
	public boolean isFeatured() {
		return this.feature;
	}


	@Override
	public void toggleFeatured() {
		this.feature = !this.feature;
	}

}
