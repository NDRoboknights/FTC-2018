package org.firstinspires.ftc.teamcode.utils;

import org.firstinspires.ftc.teamcode.Autonomous.CustomAutonomous;
import org.firstinspires.ftc.teamcode.Bot.IdealBot;
import org.firstinspires.ftc.teamcode.Enums.Color;

public class getColor
{
    //bot instantiator
    public IdealBot bot;

    //color enum
    private Color AccColor;

    //gets color values
    private  int getBlue(){return bot.colorSensor.blue();}
    private  int getRed(){return bot.colorSensor.red();}

    public Color interpretColor()
    {
        //determines color
        if(getBlue() > CustomAutonomous.COLOR_THRESHOLD && getRed()<CustomAutonomous.COLOR_THRESHOLD)
        {
            AccColor = Color.BLUE;
        }else if(getRed() > CustomAutonomous.COLOR_THRESHOLD && getBlue()<CustomAutonomous.COLOR_THRESHOLD)
        {
            AccColor = Color.RED;
        }else
        {
            AccColor = Color.UNKNOWN;
        }
        return AccColor;
    }
}
