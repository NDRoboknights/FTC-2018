package org.firstinspires.ftc.teamcode.Bot;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import org.firstinspires.ftc.teamcode.PID.ADAFruitIMU;


public class IdealBot extends Bot
{
    //instantiates bot to be used for arrays
    private Bot bot;

    //hmap
    private HardwareMap hardwareMap;

    //bot hardware
    public ColorSensor colorSensor;
    public DcMotor lMotor;
    public DcMotor rMotor;
    public DcMotor fLMotor;
    public DcMotor fRMotor;
    public ADAFruitIMU imu;
    public OpticalDistanceSensor oDS;

    //constructor
    public IdealBot(HardwareMap hMap)
    {
        //identifies the hardwaremap variable as the one in this class
        //sets it equal to the one given by the code in the teleop class
        this.hardwareMap = hMap;
    }

    //initializing hardware
    public void init(HardwareMap hardwareMap)
    {

        //motors, all set to use encoders
        fRMotor = hardwareMap.dcMotor.get("fRMotor");
        fRMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rMotor = hardwareMap.dcMotor.get("rMotor");
        rMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        fLMotor = hardwareMap.dcMotor.get("fLMotor");
        fLMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        lMotor = hardwareMap.dcMotor.get("lMotor");
        lMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);;

        //sensors
        imu = new ADAFruitIMU(hardwareMap, "imu");
        oDS = hardwareMap.opticalDistanceSensor.get("oDS");
        colorSensor = hardwareMap.colorSensor.get("cSensor");

        //adds to list
        bot.leftMotors.add(lMotor);
        bot.leftMotors.add(fLMotor);
        bot.rightMotors.add(rMotor);
        bot.rightMotors.add(fRMotor);
    }
}
