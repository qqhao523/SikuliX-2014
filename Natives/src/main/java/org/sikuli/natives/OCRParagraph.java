/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.sikuli.natives;

public class OCRParagraph extends OCRRect {
  private long swigCPtr;

  protected OCRParagraph(long cPtr, boolean cMemoryOwn) {
    super(VisionProxyJNI.OCRParagraph_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCRParagraph obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        VisionProxyJNI.delete_OCRParagraph(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public OCRLines getLines() {
    return new OCRLines(VisionProxyJNI.OCRParagraph_getLines(swigCPtr, this), true);
  }

  public OCRParagraph() {
    this(VisionProxyJNI.new_OCRParagraph(), true);
  }

}
