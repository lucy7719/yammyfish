import javax.swing.ImageIcon;

public class Piranha extends Fish {

	public Piranha(Pos startPoint)
	{
		super((int)startPoint.getX(), (int)startPoint.getY(), 10, 0.25, 0.05);
		this.setLevel(5);
		
		this.imageFish = new FishSprite();
		

		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_3_right.png"));
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_3_left.png"));
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_3_right.png"));
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_3_left.png"));
		
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_3_right.png"));
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_3_left.png"));
		
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_4_right.png"));
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_4_left.png"));
		
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_5_right.png"));
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_5_left.png"));
		
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_6_right.png"));
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_6_left.png"));
		
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_7_right.png"));
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_7_left.png"));
		
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_8_right.png"));
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_8_left.png"));
		
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_9_right.png"));
		imageFish.addImageIcon(new ImageIcon("img\\fish\\Pina\\Pina_9_left.png"));
	}

	public void useAbility()
	{
		
	}
	public boolean isPlayer()
	{
		return true;
	}
	public boolean isOutOfbound()
	{
		if(!(0<location.getX()&&location.getX()<800)
		|| !(0<location.getY()&&location.getY()<600))
			return true;
				
		return false;
	}
	public boolean isEatable(Fish fish)
	{
		if(fish.isPlayer())
		{
			if(this.isPlayer())
			{
				if(this.getLevel()-fish.getLevel()>0)
					return true;
				else
					return false;
			}
			else {
				if(this.getLevel()>fish.getLevel())
					return true;
				else
					return false;
			}
		}
		else
		{
			if(this.isPlayer())
			{
				if(this.getLevel()>=fish.getLevel())
					return true;
				else
					return false;
			}
			else {
				
				return false;
			}
		}
	}
	public void move()
	{
		super.move();
		
		double flocateX;
		double flocateY;
		
		flocateX = location.getX();
		flocateY = location.getY();
		
		if(flocateX<0)
			flocateX=800;
		else if(flocateX>800)
			flocateX=0;
		
		if(flocateY<0)
			flocateY=0;
		else if(flocateY>600)
			flocateY=600;
		
		location.setValue(flocateX, flocateY);
		colCenter.setValue(flocateX, flocateY);
	}
	public int getType()
	{
		return Fish.VF_PIRANHA;
	}
}