/*
 *  Copyright (c) 2021, Oracle and/or its affiliates. All rights reserved.
 *  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 *  This code is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License version 2 only, as
 *  published by the Free Software Foundation.  Oracle designates this
 *  particular file as subject to the "Classpath" exception as provided
 *  by Oracle in the LICENSE file that accompanied this code.
 *
 *  This code is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 *  version 2 for more details (a copy is included in the LICENSE file that
 *  accompanied this code).
 *
 *  You should have received a copy of the GNU General Public License version
 *  2 along with this work; if not, write to the Free Software Foundation,
 *  Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 *   Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 *  or visit www.oracle.com if you need additional information or have any
 *  questions.
 */

// Generated by jextract

package org.openjdk.jextract.clang.libclang;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$0 {

    static final FunctionDescriptor clang_getCString$FUNC = FunctionDescriptor.of(ADDRESS,
        MemoryLayout.structLayout(
            ADDRESS.withName("data"),
            JAVA_INT.withName("private_flags"),
            MemoryLayout.paddingLayout(32)
        )
    );
    static final MethodHandle clang_getCString$MH = RuntimeHelper.downcallHandle(
        "clang_getCString",
        constants$0.clang_getCString$FUNC, false
    );
    static final FunctionDescriptor clang_disposeString$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            ADDRESS.withName("data"),
            JAVA_INT.withName("private_flags"),
            MemoryLayout.paddingLayout(32)
        )
    );
    static final MethodHandle clang_disposeString$MH = RuntimeHelper.downcallHandle(
        "clang_disposeString",
        constants$0.clang_disposeString$FUNC, false
    );
    static final FunctionDescriptor clang_createIndex$FUNC = FunctionDescriptor.of(ADDRESS,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle clang_createIndex$MH = RuntimeHelper.downcallHandle(
        "clang_createIndex",
        constants$0.clang_createIndex$FUNC, false
    );
    static final FunctionDescriptor clang_disposeIndex$FUNC = FunctionDescriptor.ofVoid(
        ADDRESS
    );
    static final MethodHandle clang_disposeIndex$MH = RuntimeHelper.downcallHandle(
        "clang_disposeIndex",
        constants$0.clang_disposeIndex$FUNC, false
    );
    static final FunctionDescriptor clang_getFileName$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        ADDRESS.withName("data"),
        JAVA_INT.withName("private_flags"),
        MemoryLayout.paddingLayout(32)
    ),
        ADDRESS
    );
    static final MethodHandle clang_getFileName$MH = RuntimeHelper.downcallHandle(
        "clang_getFileName",
        constants$0.clang_getFileName$FUNC, false
    );
    static final FunctionDescriptor clang_getNullLocation$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, ADDRESS).withName("ptr_data"),
        JAVA_INT.withName("int_data"),
        MemoryLayout.paddingLayout(32)
    ));
    static final MethodHandle clang_getNullLocation$MH = RuntimeHelper.downcallHandle(
        "clang_getNullLocation",
        constants$0.clang_getNullLocation$FUNC, false
    );
}

