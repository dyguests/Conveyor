package com.fanhl.conveyor

/**
 * 实现以下功能：
 *
 * A \
 *    - C - ...
 * B /
 */
interface Poper {
    fun addStater(stater: Stater)

    interface Stater {
        fun addInputStater(stater: Stater)

        fun onInput(data: Int)

        fun onOutput(onOutput: OnOutput)
    }

    interface OnOutput {
        fun action(data: Int)
    }
}