class Solution {
    fun angleClock(hour: Int, minutes: Int): Double {
      val minAngleCovered = 6.0 * minutes
      val hourAngleCovered = 0.5 * ((hour % 12) * 60) + 0.5 * minutes
      
      val angle = Math.abs(hourAngleCovered - minAngleCovered)
      
      return if (angle > 180.0) 360.0 - angle else angle
    }
}

