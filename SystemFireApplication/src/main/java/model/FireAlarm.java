package model;

import java.util.List;

import Interface.FireAlarmObserver;
import Interface.FireAlarmSubject;

public class FireAlarm implements FireAlarmSubject {
private List<FireAlarmObserver> observers;

@Override
public void registerObserver(FireAlarmObserver observer) {
	observers.add(observer); 
}



}
