package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.TouchSensor;

public class HardwareGroup {
    public final DcMotor grayMotor;
    public final TouchSensor button;

    public HardwareGroup(HardwareMap hardwareMap) {
        grayMotor = hardwareMap.dcMotor.get("grayMotor");
        button = hardwareMap.touchSensor.get("button");
    }

}