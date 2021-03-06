/*
 * Copyright (c) 2017 Intland Software (support@intland.com)
 *
 */
package com.intland.codebeamer.api.client;

import com.intland.codebeamer.api.client.dto.TestResultContextDto;

public class CodebeamerApiConfiguration {
    private static CodebeamerApiConfiguration instance = null;
    private String uri;
    private String username;
    private String password;

    private Integer testConfigurationId;
    private Integer testCaseTrackerId;
    private Integer testCaseId;
    private Integer releaseId;
    private Integer testRunTrackerId;
    private String defaultPackagePrefix;

    private String buildIdentifier;

    private CodebeamerApiConfiguration() {

    }

    public static CodebeamerApiConfiguration getInstance() {
        if (instance == null) {
            instance = new CodebeamerApiConfiguration();
        }
        return instance;
    }

    public String getUri() {
        return uri;
    }

    public CodebeamerApiConfiguration withUri(String uri) {
        this.uri = uri;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public CodebeamerApiConfiguration withUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public CodebeamerApiConfiguration withPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getTestConfigurationId() {
        return testConfigurationId;
    }

    public CodebeamerApiConfiguration withTestConfigurationId(Integer id) {
        this.testConfigurationId = id;
        return this;
    }

    public Integer getTestCaseTrackerId() {
        return testCaseTrackerId;
    }

    public CodebeamerApiConfiguration withTestCaseTrackerId(Integer id) {
        this.testCaseTrackerId = id;
        return this;
    }

	public Integer getTestCaseId() {
        return testCaseId;
    }

    public CodebeamerApiConfiguration withTestCaseId(Integer id) {
        this.testCaseId = id;
        return this;
    }
	
    public Integer getReleaseId() {
        return releaseId;
    }

    public CodebeamerApiConfiguration withReleaseId(Integer id) {
        this.releaseId = id;
        return this;
    }

    public CodebeamerApiConfiguration withDefaultPackagePrefix(String defaultPackagePrefix) {
    	this.defaultPackagePrefix = defaultPackagePrefix;
    	return this;
    }
    
    public Integer getTestRunTrackerId() {
        return testRunTrackerId;
    }

    public CodebeamerApiConfiguration withTestRunTrackerId(Integer id) {
        this.testRunTrackerId = id;
        return this;
    }

    public String getBuildIdentifier() {
        return buildIdentifier;
    }

    public CodebeamerApiConfiguration withBuildIdentifier(String buildIdentifier) {
        this.buildIdentifier = buildIdentifier;
        return this;
    }

    public TestResultContextDto getTestResultConfigurationDto() {
        TestResultContextDto configurationDto = new TestResultContextDto();
        configurationDto.setTestConfigurationId(testConfigurationId);
        configurationDto.setTestCaseTrackerId(testCaseTrackerId);
        configurationDto.setTestCaseId(testCaseId);
        configurationDto.setReleaseId(releaseId);
        configurationDto.setTestRunTrackerId(testRunTrackerId);
        configurationDto.setBuildIdentifier(buildIdentifier);
        configurationDto.setDefaultPackagePrefix(defaultPackagePrefix);
        return configurationDto;
    }
}
