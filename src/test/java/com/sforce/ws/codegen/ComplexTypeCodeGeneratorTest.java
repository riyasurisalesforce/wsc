/*
 * Copyright (c) 2017, salesforce.com, inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided
 * that the following conditions are met:
 *
 *    Redistributions of source code must retain the above copyright notice, this list of conditions and the
 *    following disclaimer.
 *
 *    Redistributions in binary form must reproduce the above copyright notice, this list of conditions and
 *    the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *    Neither the name of salesforce.com, inc. nor the names of its contributors may be used to endorse or
 *    promote products derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package com.sforce.ws.codegen;

import java.util.ArrayList;
import java.util.List;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupDir;

import junit.framework.TestCase;

import com.sforce.ws.codegen.metadata.ComplexClassMetadata;
import com.sforce.ws.codegen.metadata.MemberMetadata;
import com.sforce.ws.tools.wsdlc;

public class ComplexTypeCodeGeneratorTest extends TestCase {

    public void testGenerateComplexTypeWithDeprecation() {
        final String packageName = "com.sforce.soap.partner.wsc";
        final String className = "EmailSyncEntityDep";
        final String typeExtension = "implements com.sforce.ws.bind.XMLizable";
        final String xsiType = "";
        final String superWrite = "";
        final String superLoad = "";
        final String superToString = "";

        List<MemberMetadata> memberMetadataList = getExpectedLitsOfMemberMetadata();
        generateMetadataAndVerify(packageName, className, typeExtension, xsiType, superWrite, superLoad, superToString, memberMetadataList, false, "EmailSyncEntityDep.java", true);
        generateMetadataAndVerify(packageName, className, typeExtension, xsiType, superWrite, superLoad, superToString, memberMetadataList, true, "EmailSyncEntityInterfaceDep.java", true);

    }

    public void testGenerateComplexTypeSource() throws Exception {
        final String packageName = "com.sforce.soap.partner.wsc";
        final String className = "EmailSyncEntity";
        final String typeExtension = "implements com.sforce.ws.bind.XMLizable";
        final String xsiType = "";
        final String superWrite = "";
        final String superLoad = "";
        final String superToString = "";

        List<MemberMetadata> memberMetadataList = getExpectedLitsOfMemberMetadata();
        generateMetadataAndVerify(packageName, className, typeExtension, xsiType, superWrite, superLoad, superToString, memberMetadataList, false, "EmailSyncEntity.java", false);
        generateMetadataAndVerify(packageName, className, typeExtension, xsiType, superWrite, superLoad, superToString, memberMetadataList, true, "EmailSyncEntityInterface.java", false);
    }

    private List<MemberMetadata> getExpectedLitsOfMemberMetadata() {
        List<MemberMetadata> memberMetadataList = new ArrayList<MemberMetadata>();

        memberMetadataList
                .add(MemberMetadata
                        .newInstance(
                                "conflictResolution of type {urn:partner.soap.sforce.com}EmailSyncConflictResolution",
                                "com.sforce.soap.partner.wsc.EmailSyncConflictResolution",
                                "conflictResolution",
                                "\"urn:partner.soap.sforce.com\",\"conflictResolution\",\"urn:partner.soap.sforce.com\",\"EmailSyncConflictResolution\",1,1,true",
                                "", "getConflictResolution", "", "", "setConflictResolution", "writeObject",
                                "verifyElement", "readObject", true, "com.sforce.soap.partner.wsc.IEmailSyncConflictResolution", false, "writeFieldConflictResolution"));

        memberMetadataList
                .add(MemberMetadata
                        .newInstance(
                                "dataSetFilter of type {http://www.w3.org/2001/XMLSchema}string",
                                "java.lang.String",
                                "dataSetFilter",
                                "\"urn:partner.soap.sforce.com\",\"dataSetFilter\",\"http://www.w3.org/2001/XMLSchema\",\"string\",0,1,true",
                                "", "getDataSetFilter", "", "", "setDataSetFilter", "writeString", "isElement",
                                "readString", true, "java.lang.String", false, "writeFieldDataSetFilter"));

        memberMetadataList
                .add(MemberMetadata
                        .newInstance(
                                "fieldMapping of type {urn:partner.soap.sforce.com}EmailSyncFieldMapping",
                                "com.sforce.soap.partner.wsc.EmailSyncFieldMapping[]",
                                "fieldMapping",
                                "\"urn:partner.soap.sforce.com\",\"fieldMapping\",\"urn:partner.soap.sforce.com\",\"EmailSyncFieldMapping\",0,-1,true",
                                " = new com.sforce.soap.partner.wsc.EmailSyncFieldMapping[0]", "getFieldMapping", "",
                                "", "setFieldMapping", "writeObject", "isElement", "readObject", false, "com.sforce.soap.partner.wsc.IEmailSyncFieldMapping[]", true, "writeFieldFieldMapping"));

        memberMetadataList
                .add(MemberMetadata
                        .newInstance(
                                "matchPreference of type {urn:partner.soap.sforce.com}EmailSyncMatchPreference",
                                "com.sforce.soap.partner.wsc.EmailSyncMatchPreference",
                                "matchPreference",
                                "\"urn:partner.soap.sforce.com\",\"matchPreference\",\"urn:partner.soap.sforce.com\",\"EmailSyncMatchPreference\",1,1,true",
                                "", "getMatchPreference", "", "", "setMatchPreference", "writeObject", "verifyElement",
                                "readObject", false, "com.sforce.soap.partner.wsc.IEmailSyncMatchPreference", false, "writeFieldMatchPreference"));

        memberMetadataList.add(MemberMetadata.newInstance("name of type {http://www.w3.org/2001/XMLSchema}string",
                "java.lang.String", "name",
                "\"urn:partner.soap.sforce.com\",\"name\",\"http://www.w3.org/2001/XMLSchema\",\"string\",1,1,true",
                "", "getName", "", "", "setName", "writeString", "verifyElement", "readString", false, "java.lang.String", false, "writeFieldName"));

        memberMetadataList.add(MemberMetadata.newInstance("recordTypeId of type {urn:partner.soap.sforce.com}ID",
                "java.lang.String", "recordTypeId",
                "\"urn:partner.soap.sforce.com\",\"recordTypeId\",\"urn:partner.soap.sforce.com\",\"ID\",1,1,true", "",
                "getRecordTypeId", "", "", "setRecordTypeId", "writeString", "verifyElement", "readString", true, "java.lang.String", false, "writeFieldRecordTypeId"));

        memberMetadataList
                .add(MemberMetadata
                        .newInstance(
                                "syncDirection of type {urn:partner.soap.sforce.com}EmailSyncDirection",
                                "com.sforce.soap.partner.wsc.EmailSyncDirection",
                                "syncDirection",
                                "\"urn:partner.soap.sforce.com\",\"syncDirection\",\"urn:partner.soap.sforce.com\",\"EmailSyncDirection\",1,1,true",
                                "", "getSyncDirection", "", "", "setSyncDirection", "writeObject", "verifyElement",
                                "readObject", true, "com.sforce.soap.partner.wsc.IEmailSyncDirection", false, "writeFieldSyncDirection"));

        memberMetadataList
                .add(MemberMetadata
                        .newInstance(
                                "syncFollowed of type {http://www.w3.org/2001/XMLSchema}boolean",
                                "boolean",
                                "syncFollowed",
                                "\"urn:partner.soap.sforce.com\",\"syncFollowed\",\"http://www.w3.org/2001/XMLSchema\",\"boolean\",1,1,true",
                                "", "getSyncFollowed", "boolean", "isSyncFollowed", "setSyncFollowed", "writeBoolean",
                                "verifyElement", "readBoolean", true, "boolean", false, "writeFieldSyncFollowed"));
        return memberMetadataList;
    }

    public void generateMetadataAndVerify(String packageName, String className, String typeExtension, String xsiType, String superWrite, String superLoad, String superToString, List<MemberMetadata> memberMetadataList, boolean generateInterfaces, String expectedSourceFileName, boolean shouldHaveDeprecatedAnnotations) {
        String expectedSource = CodeGeneratorTestUtil.fileToString(expectedSourceFileName);

        ST template = CodeGeneratorTestUtil.getTemplateDefinitions(Generator.TYPE);
        final ComplexClassMetadata classMetadata = new ComplexClassMetadata(packageName, className, typeExtension,
                xsiType, superWrite, superLoad, superToString, memberMetadataList, generateInterfaces, packageName, "EmailSyncEntityBase", shouldHaveDeprecatedAnnotations);
        template.add("gen", classMetadata);

        assertEquals(expectedSource, CodeGeneratorTestUtil.getRenderedStringWithReplacements(template));
    }
}
