package userinterface;

import java.util.Observable;
import java.util.Observer;

import gamecontrol.GameManager;

public class HighScoreScreen extends GameScreen implements Observer
{

	public HighScoreScreen( ScreenManager screenManager)
	{
		super( screenManager);
	}

	@Override
	public void update(Observable arg0, Object arg1)
	{
		// TODO Auto-generated method stub
		
	}

}
