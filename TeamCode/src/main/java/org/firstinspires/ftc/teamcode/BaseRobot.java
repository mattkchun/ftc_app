package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by andrew on Oct 31, 2017 as part of ftc_app in org.firstinspires.ftc.teamcode.
 */

class BaseRobot extends OpMode {

    DcMotor left_drive, right_drive, left_lift, right_lift, left_intake, right_intake;
    ElapsedTime timer;
    Servo jewel_servo;
    ColorSensor jewel_color;

    @Override
    public void init() {
        left_drive = hardwareMap.get(DcMotor.class, "left_drive");
        right_drive = hardwareMap.get(DcMotor.class, "right_drive");
        left_lift = hardwareMap.get(DcMotor.class, "left_lift");
        right_lift = hardwareMap.get(DcMotor.class, "right_lift");
        left_intake = hardwareMap.get(DcMotor.class, "left_intake");
        right_intake = hardwareMap.get(DcMotor.class, "right_intake");

        right_drive.setDirection(DcMotor.Direction.REVERSE);

        jewel_servo = hardwareMap.get(Servo.class, "jewel_servo");
        jewel_color = hardwareMap.get(ColorSensor.class, "jewel_color");

    }

    @Override
    public void start() {
        timer.reset();
    }

    @Override
    public void loop() {

    }

    public void arcade_drive(double power, double turn) {
        double leftPower = Range.clip(power + turn, -1.0, 1.0);
        double rightPower = Range.clip(power - turn, -1.0, 1.0);

        left_drive.setPower(leftPower);
        right_drive.setPower(rightPower);
    }


    void reset_lift_encoders() {
        left_lift.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        right_lift.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        left_lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        right_lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }


    int get_left_lift_enc() {
        if (left_lift.getMode() != DcMotor.RunMode.RUN_USING_ENCODER) {
            left_lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        }
        return left_lift.getCurrentPosition();
    }

    int get_right_int_enc() {
        if (right_lift.getMode() != DcMotor.RunMode.RUN_USING_ENCODER) {
            right_lift.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        }
        return right_lift.getCurrentPosition();
    }

}
