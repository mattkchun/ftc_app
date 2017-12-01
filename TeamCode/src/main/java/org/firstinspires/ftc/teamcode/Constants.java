package org.firstinspires.ftc.teamcode;

/**
 * Created by andrew on Nov 14, 2017 as part of ftc_app in org.firstinspires.ftc.teamcode.
 */

public class Constants {
    public static final int K_PPR_LIFT = 1120;
    public static final int K_LIFT_ERROR_P = 540;

    public static final double K_JEWEL_SERVO_DOWN = 0.2;
    public static final double K_JEWEL_SERVO_UP = 0.9;

    public static final int K_PPR_DRIVE = 1120;
    public static final double K_DRIVE_WHEEL_DIA = 4; // inches
    public static final double K_DRIVE_DIA = 16.75; // inches between wheel centers

    public static final double K_DRIVE_WHEEL_CIRCUMFERENCE = K_DRIVE_WHEEL_DIA * Math.PI;
    public static final double K_PPIN_DRIVE = K_PPR_DRIVE / K_DRIVE_WHEEL_CIRCUMFERENCE;

    public static final double K_TURN_CIRCUMFERENCE = K_DRIVE_DIA * Math.PI;
    public static final double K_PPTURN_DRIVE = K_PPIN_DRIVE * K_TURN_CIRCUMFERENCE;
    public static final double K_PPDEG_DRIVE = K_PPTURN_DRIVE / 360; // pulses per degree

    public static final double K_DRIVE_ERROR_P = 200; // higher = less sensitive
}
