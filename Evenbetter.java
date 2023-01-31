package sacherrobin;
import robocode.*;

public class Evenbetter extends JuniorRobot
{
	int walls_hit = 0;
	
	public void standartmovement(){
	
	ahead(100);
	back(25);
	turnGunRight(360);	
	
	}
	
	
	public void run() {
	
	setColors(red, red, red, red, red);
	standartmovement();
		
	}
		
	
	public void onScannedRobot() {
		
		turnGunTo(scannedAngle);
		if(gunReady == true)
		{
			if(scannedDistance > 150)
			{
				fire(0.5);
			}
		
			if (scannedDistance < 150)
			{
				fire(3);
			}
		}
	
	}


	public void onHitByBullet() {
		
	    if (hitByBulletAngle != -1) 
		{
        	turnRight(hitByBulletAngle);     
        	ahead(fieldHeight / 5);
		}
	
	}
	

	public void onHitWall() {
	    
		walls_hit =  walls_hit + 1;
	 	if (walls_hit < 5)
		 {
	 		turnRight(180);
     		ahead(fieldHeight / 5);
		 }
    
		 if (walls_hit > 5)
		 {
			back(fieldHeight / 2);
		 }
	
	} 	
}


