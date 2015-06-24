package com.apollo.console.user.bean.pojo;

import java.util.Date;

public class SysOp {
    private Long opId;

    private String opName;

    private String opCode;

    private Short opKind;

    private String mobileNo;

    private String emailAdress;

    private Short opLevel;

    private Long supOpId;

    private String loginCode;

    private String loginPasswd;

    private Short state;

    private String shortName;

    private String englishName;

    private Short cardTypeId;

    private String cardNo;

    private Date birthday;

    private Short marryStatus;

    private Short gender;

    private Short religion;

    private Integer nationalType;

    private Integer educationLevel;

    private Long incomeLevel;

    private Short politicsFace;

    private String jobPosition;

    private String jobCompany;

    private String jobDesc;

    private String officeTel;

    private String faxId;

    private String homeTel;

    private String wirelessCall;

    private String alarmMobileNo;

    private String familyInfo;

    private String contactAddress;

    private Integer postalCode;

    private String securityId;

    private String carNo;

    private String characterDesc;

    private String notes;

    private String recentPassword;

    private Short recentPassTimes;

    private Short minPasswdLength;

    private Short allowChangePasswd;

    private Date acctEffectDate;

    private Date acctExpireDate;

    private Short multiLoginFlag;

    private Long lastLoginLogId;

    private Integer tryTimes;

    private Short lockFlag;

    private Short loginFlag;

    private Short superUserFlag;

    private Long passwdValidDays;

    private Integer cancelDays;

    private Date passwordValidDate;

    private Long chgPasswdAlarmDays;

    private String smsChkPasswd;

    private Date chkpwEffectTime;

    private Date chkpwExpireTime;

    private Short dataState;

    private Long creator;

    private Date createDate;

    private Long modifier;

    private Date modifyDate;

    public Long getOpId() {
        return opId;
    }

    public void setOpId(Long opId) {
        this.opId = opId;
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName == null ? null : opName.trim();
    }

    public String getOpCode() {
        return opCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode == null ? null : opCode.trim();
    }

    public Short getOpKind() {
        return opKind;
    }

    public void setOpKind(Short opKind) {
        this.opKind = opKind;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress == null ? null : emailAdress.trim();
    }

    public Short getOpLevel() {
        return opLevel;
    }

    public void setOpLevel(Short opLevel) {
        this.opLevel = opLevel;
    }

    public Long getSupOpId() {
        return supOpId;
    }

    public void setSupOpId(Long supOpId) {
        this.supOpId = supOpId;
    }

    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode == null ? null : loginCode.trim();
    }

    public String getLoginPasswd() {
        return loginPasswd;
    }

    public void setLoginPasswd(String loginPasswd) {
        this.loginPasswd = loginPasswd == null ? null : loginPasswd.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    public Short getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(Short cardTypeId) {
        this.cardTypeId = cardTypeId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Short getMarryStatus() {
        return marryStatus;
    }

    public void setMarryStatus(Short marryStatus) {
        this.marryStatus = marryStatus;
    }

    public Short getGender() {
        return gender;
    }

    public void setGender(Short gender) {
        this.gender = gender;
    }

    public Short getReligion() {
        return religion;
    }

    public void setReligion(Short religion) {
        this.religion = religion;
    }

    public Integer getNationalType() {
        return nationalType;
    }

    public void setNationalType(Integer nationalType) {
        this.nationalType = nationalType;
    }

    public Integer getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(Integer educationLevel) {
        this.educationLevel = educationLevel;
    }

    public Long getIncomeLevel() {
        return incomeLevel;
    }

    public void setIncomeLevel(Long incomeLevel) {
        this.incomeLevel = incomeLevel;
    }

    public Short getPoliticsFace() {
        return politicsFace;
    }

    public void setPoliticsFace(Short politicsFace) {
        this.politicsFace = politicsFace;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition == null ? null : jobPosition.trim();
    }

    public String getJobCompany() {
        return jobCompany;
    }

    public void setJobCompany(String jobCompany) {
        this.jobCompany = jobCompany == null ? null : jobCompany.trim();
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc == null ? null : jobDesc.trim();
    }

    public String getOfficeTel() {
        return officeTel;
    }

    public void setOfficeTel(String officeTel) {
        this.officeTel = officeTel == null ? null : officeTel.trim();
    }

    public String getFaxId() {
        return faxId;
    }

    public void setFaxId(String faxId) {
        this.faxId = faxId == null ? null : faxId.trim();
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel == null ? null : homeTel.trim();
    }

    public String getWirelessCall() {
        return wirelessCall;
    }

    public void setWirelessCall(String wirelessCall) {
        this.wirelessCall = wirelessCall == null ? null : wirelessCall.trim();
    }

    public String getAlarmMobileNo() {
        return alarmMobileNo;
    }

    public void setAlarmMobileNo(String alarmMobileNo) {
        this.alarmMobileNo = alarmMobileNo == null ? null : alarmMobileNo.trim();
    }

    public String getFamilyInfo() {
        return familyInfo;
    }

    public void setFamilyInfo(String familyInfo) {
        this.familyInfo = familyInfo == null ? null : familyInfo.trim();
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress == null ? null : contactAddress.trim();
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getSecurityId() {
        return securityId;
    }

    public void setSecurityId(String securityId) {
        this.securityId = securityId == null ? null : securityId.trim();
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public String getCharacterDesc() {
        return characterDesc;
    }

    public void setCharacterDesc(String characterDesc) {
        this.characterDesc = characterDesc == null ? null : characterDesc.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public String getRecentPassword() {
        return recentPassword;
    }

    public void setRecentPassword(String recentPassword) {
        this.recentPassword = recentPassword == null ? null : recentPassword.trim();
    }

    public Short getRecentPassTimes() {
        return recentPassTimes;
    }

    public void setRecentPassTimes(Short recentPassTimes) {
        this.recentPassTimes = recentPassTimes;
    }

    public Short getMinPasswdLength() {
        return minPasswdLength;
    }

    public void setMinPasswdLength(Short minPasswdLength) {
        this.minPasswdLength = minPasswdLength;
    }

    public Short getAllowChangePasswd() {
        return allowChangePasswd;
    }

    public void setAllowChangePasswd(Short allowChangePasswd) {
        this.allowChangePasswd = allowChangePasswd;
    }

    public Date getAcctEffectDate() {
        return acctEffectDate;
    }

    public void setAcctEffectDate(Date acctEffectDate) {
        this.acctEffectDate = acctEffectDate;
    }

    public Date getAcctExpireDate() {
        return acctExpireDate;
    }

    public void setAcctExpireDate(Date acctExpireDate) {
        this.acctExpireDate = acctExpireDate;
    }

    public Short getMultiLoginFlag() {
        return multiLoginFlag;
    }

    public void setMultiLoginFlag(Short multiLoginFlag) {
        this.multiLoginFlag = multiLoginFlag;
    }

    public Long getLastLoginLogId() {
        return lastLoginLogId;
    }

    public void setLastLoginLogId(Long lastLoginLogId) {
        this.lastLoginLogId = lastLoginLogId;
    }

    public Integer getTryTimes() {
        return tryTimes;
    }

    public void setTryTimes(Integer tryTimes) {
        this.tryTimes = tryTimes;
    }

    public Short getLockFlag() {
        return lockFlag;
    }

    public void setLockFlag(Short lockFlag) {
        this.lockFlag = lockFlag;
    }

    public Short getLoginFlag() {
        return loginFlag;
    }

    public void setLoginFlag(Short loginFlag) {
        this.loginFlag = loginFlag;
    }

    public Short getSuperUserFlag() {
        return superUserFlag;
    }

    public void setSuperUserFlag(Short superUserFlag) {
        this.superUserFlag = superUserFlag;
    }

    public Long getPasswdValidDays() {
        return passwdValidDays;
    }

    public void setPasswdValidDays(Long passwdValidDays) {
        this.passwdValidDays = passwdValidDays;
    }

    public Integer getCancelDays() {
        return cancelDays;
    }

    public void setCancelDays(Integer cancelDays) {
        this.cancelDays = cancelDays;
    }

    public Date getPasswordValidDate() {
        return passwordValidDate;
    }

    public void setPasswordValidDate(Date passwordValidDate) {
        this.passwordValidDate = passwordValidDate;
    }

    public Long getChgPasswdAlarmDays() {
        return chgPasswdAlarmDays;
    }

    public void setChgPasswdAlarmDays(Long chgPasswdAlarmDays) {
        this.chgPasswdAlarmDays = chgPasswdAlarmDays;
    }

    public String getSmsChkPasswd() {
        return smsChkPasswd;
    }

    public void setSmsChkPasswd(String smsChkPasswd) {
        this.smsChkPasswd = smsChkPasswd == null ? null : smsChkPasswd.trim();
    }

    public Date getChkpwEffectTime() {
        return chkpwEffectTime;
    }

    public void setChkpwEffectTime(Date chkpwEffectTime) {
        this.chkpwEffectTime = chkpwEffectTime;
    }

    public Date getChkpwExpireTime() {
        return chkpwExpireTime;
    }

    public void setChkpwExpireTime(Date chkpwExpireTime) {
        this.chkpwExpireTime = chkpwExpireTime;
    }

    public Short getDataState() {
        return dataState;
    }

    public void setDataState(Short dataState) {
        this.dataState = dataState;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}