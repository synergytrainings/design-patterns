package com.synisys.training.patterns.structural.proxy;

/**
 * Subject -
 * Defines the common interface for RealSubject and Proxy so that a Proxy can be used anywhere a RealSubject is expected. Defines the real object that the proxy represents.
 * @author Anania.Mikaelyan
 * @since 12/2/2014
 */
public interface  Image {
    public void showImage();
}
