/*
 * Copyright (c) 2002-2016 Gargoyle Software Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gargoylesoftware.htmlunit.javascript.host;

import static com.gargoylesoftware.js.nashorn.internal.objects.annotations.BrowserFamily.CHROME;
import static com.gargoylesoftware.js.nashorn.internal.objects.annotations.BrowserFamily.FF;
import static com.gargoylesoftware.js.nashorn.internal.objects.annotations.BrowserFamily.IE;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

import com.gargoylesoftware.htmlunit.javascript.SimpleScriptObject;
import com.gargoylesoftware.js.nashorn.ScriptUtils;
import com.gargoylesoftware.js.nashorn.internal.objects.Global;
import com.gargoylesoftware.js.nashorn.internal.objects.annotations.Getter;
import com.gargoylesoftware.js.nashorn.internal.objects.annotations.Setter;
import com.gargoylesoftware.js.nashorn.internal.objects.annotations.WebBrowser;
import com.gargoylesoftware.js.nashorn.internal.runtime.Context;
import com.gargoylesoftware.js.nashorn.internal.runtime.PrototypeObject;
import com.gargoylesoftware.js.nashorn.internal.runtime.ScriptFunction;

public class Screen2 extends SimpleScriptObject {

    public static Screen2 constructor(final boolean newObj, final Object self) {
        final Screen2 host = new Screen2();
        host.setProto(((Global) self).getPrototype(host.getClass()));
        ScriptUtils.initialize(host);
        return host;
    }

    /**
     * Returns the {@code availHeight} property.
     * @return the {@code availHeight} property
     */
    @Getter
    public int getAvailHeight() {
        return 768;
    }

    /**
     * Sets the {@code availHeight} property.
     * @param availHeight the {@code availHeight} property
     */
    @Setter
    public void setAvailHeight(final int availHeight) {
        // ignore
    }

    /**
     * Returns the {@code availLeft} property.
     * @return the {@code availLeft} property
     */
    @Getter({@WebBrowser(FF), @WebBrowser(CHROME)})
    public int getAvailLeft() {
        return 0;
    }

    /**
     * Sets the {@code availLeft} property.
     * @param availLeft the {@code availLeft} property
     */
    @Setter({@WebBrowser(FF), @WebBrowser(CHROME)})
    public void setAvailLeft(final int availLeft) {
        // otherwise ignore
    }

    /**
     * Returns the {@code availTop} property.
     * @return the {@code availTop} property
     */
    @Getter({@WebBrowser(FF), @WebBrowser(CHROME)})
    public int getAvailTop() {
        return 0;
    }

    /**
     * Sets the {@code availTop} property.
     * @param availTop the {@code availTop} property
     */
    @Setter({@WebBrowser(FF), @WebBrowser(CHROME)})
    public void setAvailTop(final int availTop) {
        // ignore
    }

    /**
     * Returns the {@code availWidth} property.
     * @return the {@code availWidth} property
     */
    @Getter
    public int getAvailWidth() {
        return 1024;
    }

    /**
     * Sets the {@code availWidth} property.
     * @param availWidth the {@code availWidth} property
     */
    @Setter
    public void setAvailWidth(final int availWidth) {
        // ignore
    }

    /**
     * Returns the {@code bufferDepth} property.
     * @return the {@code bufferDepth} property
     */
    @Getter(@WebBrowser(IE))
    public int getBufferDepth() {
        return 0;
    }

    /**
     * Sets the {@code bufferDepth} property.
     * @param bufferDepth the {@code bufferDepth} property
     */
    @Setter(@WebBrowser(IE))
    public void setBufferDepth(final int bufferDepth) {
        // ignore
    }

    /**
     * Returns the {@code colorDepth} property.
     * @return the {@code colorDepth} property
     */
    @Getter
    public int getColorDepth() {
        return 24;
    }

    /**
     * Sets the {@code colorDepth} property.
     * @param colorDepth the {@code colorDepth} property
     */
    @Setter
    public void setColorDepth(final int colorDepth) {
        // ignore
    }

    /**
     * Returns the {@code deviceXDPI} property.
     * @return the {@code deviceXDPI} property
     */
    @Getter(@WebBrowser(IE))
    public int getDeviceXDPI() {
        return 96;
    }

    /**
     * Sets the {@code deviceXDPI} property.
     * @param deviceXDPI the {@code deviceXDPI} property
     */
    @Setter(@WebBrowser(IE))
    public void setDeviceXDPI(final int deviceXDPI) {
        // ignore
    }

    /**
     * Returns the {@code deviceYDPI} property.
     * @return the {@code deviceYDPI} property
     */
    @Getter(@WebBrowser(IE))
    public int getDeviceYDPI() {
        return 96;
    }

    /**
     * Sets the {@code deviceYDPI} property.
     * @param deviceYDPI the {@code deviceYDPI} property
     */
    @Setter(@WebBrowser(IE))
    public void setDeviceYDPI(final int deviceYDPI) {
        // ignore
    }

    /**
     * Returns the {@code fontSmoothingEnabled} property.
     * @return the {@code fontSmoothingEnabled} property
     */
    @Getter(@WebBrowser(IE))
    public boolean getFontSmoothingEnabled() {
        return true;
    }

    /**
     * Sets the {@code fontSmoothingEnabled} property.
     * @param fontSmoothingEnabled the {@code fontSmoothingEnabled} property
     */
    @Setter(@WebBrowser(IE))
    public void setFontSmoothingEnabled(final boolean fontSmoothingEnabled) {
        // ignore
    }

    /**
     * Returns the {@code height} property.
     * @return the {@code height} property
     */
    @Getter
    public int getHeight() {
        return 768;
    }

    /**
     * Sets the {@code height} property.
     * @param height the {@code height} property
     */
    @Setter
    public void setHeight(final int height) {
        // ignore
    }

    /**
     * Returns the {@code left} property.
     * @return the {@code left} property
     */
    @Getter(@WebBrowser(FF))
    public int getLeft() {
        return 0;
    }

    /**
     * Sets the {@code left} property.
     * @param left the {@code left} property
     */
    @Setter(@WebBrowser(FF))
    public void setLeft(final int left) {
        // ignore
    }

    /**
     * Returns the {@code logicalXDPI} property.
     * @return the {@code logicalXDPI} property
     */
    @Getter(@WebBrowser(IE))
    public int getLogicalXDPI() {
        return 96;
    }

    /**
     * Sets the {@code logicalXDPI} property.
     * @param logicalXDPI the {@code logicalXDPI} property
     */
    @Setter(@WebBrowser(IE))
    public void setLogicalXDPI(final int logicalXDPI) {
        // ignore
    }

    /**
     * Returns the {@code logicalYDPI} property.
     * @return the {@code logicalYDPI} property
     */
    @Getter(@WebBrowser(IE))
    public int getLogicalYDPI() {
        return 96;
    }

    /**
     * Sets the {@code logicalYDPI} property.
     * @param logicalYDPI the {@code logicalYDPI} property
     */
    @Setter(@WebBrowser(IE))
    public void setLogicalYDPI(final int logicalYDPI) {
        // ignore
    }

    /**
     * Returns the {@code pixelDepth} property.
     * @return the {@code pixelDepth} property
     */
    @Getter
    public int getPixelDepth() {
        return 24;
    }

    /**
     * Sets the {@code pixelDepth} property.
     * @param pixelDepth the {@code pixelDepth} property
     */
    @Setter
    public void setPixelDepth(final int pixelDepth) {
        // ignore
    }

    /**
     * Returns the {@code systemXDPI} property.
     * @return the {@code systemXDPI} property
     */
    @Getter(@WebBrowser(IE))
    public int getSystemXDPI() {
        return 96;
    }

    /**
     * Sets the {@code systemXDPI} property.
     * @param systemXDPI the {@code systemXDPI} property
     */
    @Setter(@WebBrowser(IE))
    public void setSystemXDPI(final int systemXDPI) {
        // ignore
    }

    /**
     * Returns the {@code systemYDPI} property.
     * @return the {@code systemYDPI} property
     */
    @Getter(@WebBrowser(IE))
    public int getSystemYDPI() {
        return 96;
    }

    /**
     * Sets the {@code systemYDPI} property.
     * @param systemYDPI the {@code systemYDPI} property
     */
    @Setter(@WebBrowser(IE))
    public void setSystemYDPI(final int systemYDPI) {
        // ignore
    }

    /**
     * Returns the {@code top} property.
     * @return the {@code top} property
     */
    @Getter(@WebBrowser(FF))
    public int getTop() {
        return 0;
    }

    /**
     * Sets the {@code top} property.
     * @param top the {@code top} property
     */
    @Setter(@WebBrowser(FF))
    public void setTop(final int top) {
        // ignore
    }

    /**
     * Returns the {@code width} property.
     * @return the {@code width} property
     */
    @Getter
    public int getWidth() {
        return 1024;
    }

    /**
     * Sets the {@code width} property.
     * @param width the {@code width} property
     */
    @Setter
    public void setWidth(final int width) {
        // ignore
    }

    private static MethodHandle staticHandle(final String name, final Class<?> rtype, final Class<?>... ptypes) {
        try {
            return MethodHandles.lookup().findStatic(Screen2.class,
                    name, MethodType.methodType(rtype, ptypes));
        }
        catch (final ReflectiveOperationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static final class FunctionConstructor extends ScriptFunction {
        public FunctionConstructor() {
            super("Screen", 
                    staticHandle("constructor", Screen2.class, boolean.class, Object.class),
                    null);
            final Prototype prototype = new Prototype();
            PrototypeObject.setConstructor(prototype, this);
            setPrototype(prototype);
        }
    }

    public static final class Prototype extends PrototypeObject {
        Prototype() {
            ScriptUtils.initialize(this);
        }

        public String getClassName() {
            return "Screen";
        }
    }
}
