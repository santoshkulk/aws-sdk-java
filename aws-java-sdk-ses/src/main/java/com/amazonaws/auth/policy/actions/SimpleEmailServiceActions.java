/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for Amazon SES.
 */

public enum SimpleEmailServiceActions implements Action {

    /** Represents any action executed on Amazon SES. */
    AllSimpleEmailServiceActions("ses:*"),

    /** Action for the CloneReceiptRuleSet operation. */
    CloneReceiptRuleSet("ses:CloneReceiptRuleSet"),
    /** Action for the CreateReceiptFilter operation. */
    CreateReceiptFilter("ses:CreateReceiptFilter"),
    /** Action for the CreateReceiptRule operation. */
    CreateReceiptRule("ses:CreateReceiptRule"),
    /** Action for the CreateReceiptRuleSet operation. */
    CreateReceiptRuleSet("ses:CreateReceiptRuleSet"),
    /** Action for the DeleteIdentity operation. */
    DeleteIdentity("ses:DeleteIdentity"),
    /** Action for the DeleteIdentityPolicy operation. */
    DeleteIdentityPolicy("ses:DeleteIdentityPolicy"),
    /** Action for the DeleteReceiptFilter operation. */
    DeleteReceiptFilter("ses:DeleteReceiptFilter"),
    /** Action for the DeleteReceiptRule operation. */
    DeleteReceiptRule("ses:DeleteReceiptRule"),
    /** Action for the DeleteReceiptRuleSet operation. */
    DeleteReceiptRuleSet("ses:DeleteReceiptRuleSet"),
    /** Action for the DeleteVerifiedEmailAddress operation. */
    DeleteVerifiedEmailAddress("ses:DeleteVerifiedEmailAddress"),
    /** Action for the DescribeActiveReceiptRuleSet operation. */
    DescribeActiveReceiptRuleSet("ses:DescribeActiveReceiptRuleSet"),
    /** Action for the DescribeReceiptRule operation. */
    DescribeReceiptRule("ses:DescribeReceiptRule"),
    /** Action for the DescribeReceiptRuleSet operation. */
    DescribeReceiptRuleSet("ses:DescribeReceiptRuleSet"),
    /** Action for the GetIdentityDkimAttributes operation. */
    GetIdentityDkimAttributes("ses:GetIdentityDkimAttributes"),
    /** Action for the GetIdentityMailFromDomainAttributes operation. */
    GetIdentityMailFromDomainAttributes(
            "ses:GetIdentityMailFromDomainAttributes"),
    /** Action for the GetIdentityNotificationAttributes operation. */
    GetIdentityNotificationAttributes("ses:GetIdentityNotificationAttributes"),
    /** Action for the GetIdentityPolicies operation. */
    GetIdentityPolicies("ses:GetIdentityPolicies"),
    /** Action for the GetIdentityVerificationAttributes operation. */
    GetIdentityVerificationAttributes("ses:GetIdentityVerificationAttributes"),
    /** Action for the GetSendQuota operation. */
    GetSendQuota("ses:GetSendQuota"),
    /** Action for the GetSendStatistics operation. */
    GetSendStatistics("ses:GetSendStatistics"),
    /** Action for the ListIdentities operation. */
    ListIdentities("ses:ListIdentities"),
    /** Action for the ListIdentityPolicies operation. */
    ListIdentityPolicies("ses:ListIdentityPolicies"),
    /** Action for the ListReceiptFilters operation. */
    ListReceiptFilters("ses:ListReceiptFilters"),
    /** Action for the ListReceiptRuleSets operation. */
    ListReceiptRuleSets("ses:ListReceiptRuleSets"),
    /** Action for the ListVerifiedEmailAddresses operation. */
    ListVerifiedEmailAddresses("ses:ListVerifiedEmailAddresses"),
    /** Action for the PutIdentityPolicy operation. */
    PutIdentityPolicy("ses:PutIdentityPolicy"),
    /** Action for the ReorderReceiptRuleSet operation. */
    ReorderReceiptRuleSet("ses:ReorderReceiptRuleSet"),
    /** Action for the SendBounce operation. */
    SendBounce("ses:SendBounce"),
    /** Action for the SendEmail operation. */
    SendEmail("ses:SendEmail"),
    /** Action for the SendRawEmail operation. */
    SendRawEmail("ses:SendRawEmail"),
    /** Action for the SetActiveReceiptRuleSet operation. */
    SetActiveReceiptRuleSet("ses:SetActiveReceiptRuleSet"),
    /** Action for the SetIdentityDkimEnabled operation. */
    SetIdentityDkimEnabled("ses:SetIdentityDkimEnabled"),
    /** Action for the SetIdentityFeedbackForwardingEnabled operation. */
    SetIdentityFeedbackForwardingEnabled(
            "ses:SetIdentityFeedbackForwardingEnabled"),
    /** Action for the SetIdentityHeadersInNotificationsEnabled operation. */
    SetIdentityHeadersInNotificationsEnabled(
            "ses:SetIdentityHeadersInNotificationsEnabled"),
    /** Action for the SetIdentityMailFromDomain operation. */
    SetIdentityMailFromDomain("ses:SetIdentityMailFromDomain"),
    /** Action for the SetIdentityNotificationTopic operation. */
    SetIdentityNotificationTopic("ses:SetIdentityNotificationTopic"),
    /** Action for the SetReceiptRulePosition operation. */
    SetReceiptRulePosition("ses:SetReceiptRulePosition"),
    /** Action for the UpdateReceiptRule operation. */
    UpdateReceiptRule("ses:UpdateReceiptRule"),
    /** Action for the VerifyDomainDkim operation. */
    VerifyDomainDkim("ses:VerifyDomainDkim"),
    /** Action for the VerifyDomainIdentity operation. */
    VerifyDomainIdentity("ses:VerifyDomainIdentity"),
    /** Action for the VerifyEmailAddress operation. */
    VerifyEmailAddress("ses:VerifyEmailAddress"),
    /** Action for the VerifyEmailIdentity operation. */
    VerifyEmailIdentity("ses:VerifyEmailIdentity"),

    ;

    private final String action;

    private SimpleEmailServiceActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
