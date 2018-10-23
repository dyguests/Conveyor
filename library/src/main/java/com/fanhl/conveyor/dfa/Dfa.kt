package com.fanhl.conveyor.dfa

/**
 *
 * see [https://zh.wikipedia.org/wiki/%E7%A1%AE%E5%AE%9A%E6%9C%89%E9%99%90%E7%8A%B6%E6%80%81%E8%87%AA%E5%8A%A8%E6%9C%BA]
 *
 * @param Q 一个非空有限的状态集合
 * @param E 一个输入字母表E（非空有限的字符集合）
 */
interface Dfa<Q, E> {
    /**
     * 确定有限状态自动机从起始状态开始，一个字符接一个字符地读入一个字符串E（这里的 {\displaystyle {}^{*}} {}^{*}指示Kleene星号算子。），并根据给定的转移函数一步一步地转移至下一个状态。在读完该字符串后，如果该自动机停在一个属于F的接受状态，那么它就接受该字符串，反之则拒绝该字符串。
     */
    fun accept(vararg es: E): Q?
}