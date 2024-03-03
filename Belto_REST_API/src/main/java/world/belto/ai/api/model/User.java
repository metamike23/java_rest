package world.belto.ai.api.model;

import java.util.Random;

public class User {
	
	private int id;
	
	private int[] matrix;
	
	public User(int id) {
		super();
		this.id = id;
		
		
		Random r = new Random();
		this.matrix = new int[r.nextInt(15)];
		
		for(int i = 0; i < this.matrix.length; i++) {
			this.matrix[i] = r.nextInt(100);
		}
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int[] getMatrix() {
		return matrix;
	}
	public void setMatrix(int[] matrix) {
		this.matrix = matrix;
	}

	
	
	
	

}
