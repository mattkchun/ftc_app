package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

/**
 * Created by andrew on Nov 30, 2017 as part of ftc_app in org.firstinspires.ftc.teamcode.
 */

@Autonomous
public class BlueJewelAuto extends BaseRobot {
    private int stage = 0;
    private int turnMult;

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void loop() {
        super.loop();
        switch (stage) {
            case 0:
                if (auto_drive(-0.3, 7))
                    stage++;
                set_jewel_servo(Constants.K_JEWEL_SERVO_DOWN);
                break;
            case 1:
                turnMult = get_turn_mult(false);
                stage++;
                break;
            case 2:
                if (auto_turn(turnMult * 0.2, 20))
                    stage++;
                break;
            case 3:
                if (auto_turn(-turnMult * 0.2, 20))
                    stage++;
                set_jewel_servo(Constants.K_JEWEL_SERVO_UP);
                break;
            case 4:
                if (auto_drive(0.5, 45))
                    stage++;
                break;
            default:
                break;
        }
    }
}
