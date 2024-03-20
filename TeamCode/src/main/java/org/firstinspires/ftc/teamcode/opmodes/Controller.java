package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.TouchSensor;

import org.firstinspires.ftc.teamcode.HardwareGroup;

@TeleOp(name = "Main Controller")
public class Controller extends LinearOpMode {

    private DcMotor grayMotor;
    private TouchSensor button;

    @Override
    public void runOpMode() {

        // initialize the hardware
        HardwareGroup hardware = new HardwareGroup(hardwareMap);
        grayMotor = hardware.grayMotor;
        button = hardware.button;

        waitForStart();

        boolean buttonPressed = false;
        while (opModeIsActive()) {

            // update the button boolean
            buttonPressed = button.isPressed();

            // update the driver hub telemetry
            telemetry.addData("BUTTON PRESSED", buttonPressed);
            telemetry.update();

            // do things if the button is pressed
            if (buttonPressed) {
                grayMotor.setPower(1);
            } else {
                grayMotor.setPower(0);
            }

        }
    }

}
