package com.nn.math.activations

import com.nn.Neuron

import scala.collection.mutable.ArrayBuffer

/**
 * Creates a bipolar sigmoid function for classifications tasks between -1 and 1
 * Created by george on 12/7/14.
 */
trait BipolarSigmoidFunction {

  this: Neuron =>
  /**
   * sigmoid step function activation
   * @param x
   * @param w
   * @return
   */
  def activation(x:Array[Double], w:Vector[Double]) : Double={
    // perform dot product between input and weights
    require(x.size == w.size)
    val dot = (for ((a, b) <- x zip w) yield a * b) sum
    val act = (1.0)/(1-Math.pow(Math.E,-dot))
    return act
  }
}
