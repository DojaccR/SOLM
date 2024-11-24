public abstract class ObjectEntity{
	protected Space space;
	protected float mass, hardness;
	protected float[] position, velocity, acceleration;
	
	public ObjectEntity(Space space, float[] position, float[] velocity, float[] acceleration, float mass, float hardness){
		this.space = space;
	}

	public void move(){
		// Add collision
		// Get constants from space object to govern movement
		// Check nearyby objects to check for collision
		for(int i = 0; i < position.length; i++){
			velocity[i] = velocity[i] + acceleration[i];
			position[i] = position[i] + velocity[i];
		}
	}

	public float getHard(){
		return hardness;
	}

	public float[] getPos(){
		return position;
	}

	public float[] getVel(){
		return velocity;
	}

	public float[] getAcc(){
		return acceleration;
	}

	public void setHard(float hardness){
		this.hardness = hardness;
	}

	public void setPos(float[] position){
		this.position = position;
	}

	public void setVel(float[] velocity){
		this.velocity = velocity;
	}

	public void setAcc(float[] acceleration){
		this.acceleration = acceleration;
	}
}
