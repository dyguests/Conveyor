package com.fanhl.conveyor

class SimplePoper : Poper {
    override fun addStater(stater: Poper.Stater) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class SimpleStater : Poper.Stater {
        override fun addInputStater(stater: Poper.Stater) {

        }

        override fun onInput(data: Int) {
        }

        override fun onOutput(onOutput: Poper.OnOutput) {
            onOutput.action(1)
        }
    }
}
