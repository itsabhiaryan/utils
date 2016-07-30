package com.nayragames.vis.tween.accessors;

import aurelienribon.tweenengine.TweenAccessor;
import com.badlogic.gdx.graphics.OrthographicCamera;

/**
 * A Tween Accessor for tween data member value of OrthographicCamera.
 * This class must register with Tween for implementation.
 *
 * Created by ARYAN on 12-12-2015.
 */

public class CameraAccessor implements TweenAccessor<OrthographicCamera> {

	public static final int ZOOM=0;
	public static final int POS_XY=1;

	@Override
	public int getValues(OrthographicCamera arg0, int arg1, float[] arg2) {
		
		switch(arg1) {
		case ZOOM :
			arg2[0]=arg0.zoom;
			return 1;

		case POS_XY :
			arg2[0]=arg0.position.x;
			arg2[1]=arg0.position.y;
			return 2;

			default :
			assert false;
			return -1;
		}
	}

	@Override
	public void setValues(OrthographicCamera arg0, int arg1, float[] arg2) {
		
		switch(arg1) {
		case ZOOM :
			arg0.zoom=arg2[0];
			break;

		case POS_XY :
			arg0.position.set(arg2[0],arg2[1],0);
			break;

			default :
			assert false;
			break;
		}
	}
}