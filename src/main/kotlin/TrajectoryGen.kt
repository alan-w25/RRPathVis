import com.acmerobotics.roadrunner.geometry.Pose2d
import com.acmerobotics.roadrunner.geometry.Vector2d
import com.acmerobotics.roadrunner.path.heading.ConstantInterpolator
import com.acmerobotics.roadrunner.path.heading.HeadingInterpolator
import com.acmerobotics.roadrunner.path.heading.LinearInterpolator
import com.acmerobotics.roadrunner.path.heading.SplineInterpolator
import com.acmerobotics.roadrunner.trajectory.Trajectory
import com.acmerobotics.roadrunner.trajectory.TrajectoryBuilder
import com.acmerobotics.roadrunner.trajectory.constraints.DriveConstraints

object TrajectoryGen {
    private val constraints = DriveConstraints(20.0,20.0 , 0.0, 270.0.toRadians, 270.0.toRadians, 0.0)
    private val startPose = Pose2d(-48.0, -24.0, 170.0.toRadians)

    fun createTrajectory(): ArrayList<Trajectory> {
        val list = ArrayList<Trajectory>()

        val builder1 = TrajectoryBuilder(Pose2d(-39.0,63.0, 0.0.toRadians), constraints)


            // mid stone
           /* .lineTo(Vector2d(-22.0,22.0), LinearInterpolator(-90.0.toRadians, -90.0.toRadians))
            .lineTo(Vector2d(-24.0, 22.0))
            .strafeTo(Vector2d(-16.0, 38.0))
            .reverse()
            .lineTo(Vector2d(24.0, 38.0), LinearInterpolator(-90.0.toRadians, -90.0.toRadians))
            .reverse()
            .lineTo(Vector2d(-24.0, 38.0), LinearInterpolator(-90.0.toRadians, -90.0.toRadians))
            .strafeTo(Vector2d(-46.0, 22.0))
            .lineTo(Vector2d(-48.0, 22.0))
            .strafeTo(Vector2d(-24.0, 38.0))
            .reverse()
            .lineTo(Vector2d(24.0, 38.0), LinearInterpolator(-90.0.toRadians, -90.0.toRadians))
            .reverse()
            .lineTo(Vector2d(0.0, 38.0), LinearInterpolator(-90.0.toRadians, -90.0.toRadians))*/
        //left stone
        /*.lineTo(Vector2d(-18.0, 30.0), LinearInterpolator(-90.0.toRadians, -45.0.toRadians))
        .lineTo(Vector2d(-24.0, 24.00))
        .strafeTo(Vector2d(-16.0, 38.0))
        .reverse()
        .lineTo(Vector2d(24.0, 38.0), LinearInterpolator(-90.0.toRadians, -90.0.toRadians))
        .reverse()
        .lineTo(Vector2d(-38.0, 38.0), LinearInterpolator(0.0, -180.0.toRadians))
        .strafeTo(Vector2d(-38.0, 22.0))
        .lineTo(Vector2d(-42.0, 22.0))
        .strafeTo(Vector2d(-16.0, 38.0))
        .reverse()
        .lineTo(Vector2d(24.0, 38.0), LinearInterpolator(-90.0.toRadians, -90.0.toRadians))
        .reverse()
        .lineTo(Vector2d(0.0, 38.0), LinearInterpolator(0.0, -180.0.toRadians))*/
//right stone
        /*.lineTo(Vector2d(-30.0,22.0), LinearInterpolator(-90.0.toRadians, -90.0.toRadians))
        .lineTo(Vector2d(-32.0, 22.0))
        .strafeTo(Vector2d(-16.0, 38.0))
        .reverse()
        .lineTo(Vector2d(24.0, 38.0), LinearInterpolator(-90.0.toRadians, -90.0.toRadians))
        .reverse()
        .lineTo(Vector2d(-24.0, 38.0), LinearInterpolator(-90.0.toRadians, -90.0.toRadians))
        .strafeTo(Vector2d(-55.0, 22.0))
        .lineTo(Vector2d(-60.0, 22.0))
        .strafeTo(Vector2d(-24.0, 38.0))
        .reverse()
        .lineTo(Vector2d(24.0, 38.0), LinearInterpolator(-90.0.toRadians, -90.0.toRadians))
        .reverse()
        .lineTo(Vector2d(0.0, 38.0), LinearInterpolator(-90.0.toRadians, -90.0.toRadians))*/
                //two stone and foundation
            /*.lineTo(Vector2d(-22.0,42.0), SplineInterpolator(-90.0.toRadians, -150.0.toRadians))
            .lineTo(Vector2d(-32.0, 24.0), SplineInterpolator(-150.0.toRadians, -150.0.toRadians))

            .lineTo(Vector2d(-22.0, 42.0), SplineInterpolator(-150.0.toRadians, -180.0.toRadians))
            .lineTo(Vector2d(48.0, 33.0), SplineInterpolator(180.0.toRadians, 90.0.toRadians))

            .splineTo(Pose2d(48.0, 42.0), LinearInterpolator(90.0.toRadians, 90.0.toRadians))

            .lineTo(Vector2d(-48.0, 42.0), SplineInterpolator(-180.0.toRadians, -150.0.toRadians))
            .lineTo(Vector2d(-56.0, 24.0), SplineInterpolator(-150.0.toRadians,-150.0.toRadians))

            .lineTo(Vector2d(-48.0, 42.0), SplineInterpolator(-150.0.toRadians, -180.0.toRadians))
            .lineTo(Vector2d(48.0, 42.0), SplineInterpolator(180.0.toRadians, 180.0.toRadians))

            .lineTo(Vector2d(0.0, 42.0), SplineInterpolator(180.0.toRadians,180.0.toRadians))*/
        //blue foundation
        /*.lineTo(Vector2d(48.0,33.0), SplineInterpolator(90.0.toRadians, 90.0.toRadians))
        .splineTo(Pose2d(48.0, 35.0), LinearInterpolator(90.0.toRadians, 90.0.toRadians))
        .lineTo(Vector2d(0.0, 63.0), SplineInterpolator(180.0.toRadians, 180.0.toRadians))*/
        //red foundation
        /*.lineTo(Vector2d(48.0, -33.0), SplineInterpolator(-90.0.toRadians, -90.0.toRadians))
        .splineTo(Pose2d(48.0, -35.0), LinearInterpolator(-90.0.toRadians, -90.0.toRadians))
        .lineTo(Vector2d(0.0, -63.0), SplineInterpolator(180.0.toRadians, 180.0.toRadians))*/

        //blue skystone with auto claws
            //mid
            .lineTo(Vector2d(-30.0,39.0), SplineInterpolator(-90.0.toRadians, 0.0.toRadians))
            .strafeTo(Vector2d(-30.0, 33.0))
            .strafeTo(Vector2d(-30.0, 39.0))
            .splineTo(Pose2d(-5.0, 39.0))
            .splineTo(Pose2d(44.0, 33.0))
            .reverse()
            .splineTo(Pose2d(-5.0, 39.0))
            .splineTo(Pose2d(-55.0, 39.0))
            .reverse()
            .strafeTo(Vector2d(-55.0, 33.0))
            .strafeTo(Vector2d(-55.0, 39.0))
            .splineTo(Pose2d(-5.0, 39.0))
            .splineTo(Pose2d(55.0, 33.0))
            .lineTo(Vector2d(55.0, 32.0), LinearInterpolator(0.0.toRadians, 90.0.toRadians))
            .lineTo(Vector2d(45.0, 39.0), SplineInterpolator(90.0.toRadians, 90.0.toRadians))
            .lineTo(Vector2d(0.0, 39.0), SplineInterpolator(90.0.toRadians, 180.0.toRadians))




        list.add(builder1.build())
        return list
    }

    fun drawOffbounds() {
        GraphicsUtil.fillRect(Vector2d(0.0, -63.0), 18.0, 18.0) // robot against the wall
    }
}

val Double.toRadians get() = (Math.toRadians(this))