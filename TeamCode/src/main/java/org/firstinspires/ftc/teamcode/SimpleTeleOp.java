package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by andrew on Dec 01, 2017 as part of ftc_app in org.firstinspires.ftc.teamcode.
 */

@TeleOp
public class SimpleTeleOp extends BaseRobot {
    @Override
    public void init() {
        super.init();
        set_jewel_servo(Constants.K_JEWEL_SERVO_UP);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void loop() {
        super.loop();
        tank_drive(-gamepad1.left_stick_y, -gamepad1.right_stick_y);
        drive_lift(gamepad1.dpad_up ? Constants.K_LIFT_UP_SPD : gamepad1.dpad_down ? Constants.K_LIFT_DOWN_SPD : 0);
        drive_intake(gamepad1.right_bumper ? Constants.K_INTAKE_SPD : gamepad1.left_bumper ? Constants.K_OUTPUT_SPD : 0);
    }
}
