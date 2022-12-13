package com.example.handler;

import com.example.Dimension;

public interface HandlerDimension {

  void setNext(HandlerDimension nextHandler);

  void process(Dimension dimension);

}
