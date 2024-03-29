// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Outputs
{

    [OutputType]
    public sealed class CredentialsExternal
    {
        /// <summary>
        /// Required for Hashicorp Certificate. The ID of Credentials within the Certificate Vault holding the certificate
        /// </summary>
        public readonly string? Certificate;
        /// <summary>
        /// Required for Azure Client Secret. No further documentation available
        /// </summary>
        public readonly string? ClientSecret;
        /// <summary>
        /// Required for Azure Client Secret. No further documentation available
        /// </summary>
        public readonly string? Clientid;
        /// <summary>
        /// No documentation available
        /// </summary>
        public readonly ImmutableArray<string> CredentialsUsedForExternalSynchronizations;
        /// <summary>
        /// No documentation available
        /// </summary>
        public readonly string? PasswordSecretName;
        /// <summary>
        /// Required for Hashicorp App Role or Hashicorp Certificate. No further documentation available
        /// </summary>
        public readonly string? PathToCredentials;
        /// <summary>
        /// Required for Hashicorp App Role. No further documentation available
        /// </summary>
        public readonly string? Roleid;
        /// <summary>
        /// Required for Hashicorp App Role. The ID of Credentials within the Certificate Vault holding the secret id
        /// </summary>
        public readonly string? Secretid;
        /// <summary>
        /// Required for Azure Client Secret. No further documentation available
        /// </summary>
        public readonly string? Tenantid;
        /// <summary>
        /// No documentation available
        /// </summary>
        public readonly string? TokenSecretName;
        /// <summary>
        /// No documentation available
        /// </summary>
        public readonly string? UsernameSecretName;
        /// <summary>
        /// Required for Hashicorp App Role. No further documentation available
        /// </summary>
        public readonly string? VaultNamespace;
        /// <summary>
        /// No documentation available
        /// </summary>
        public readonly string? VaultUrl;

        [OutputConstructor]
        private CredentialsExternal(
            string? certificate,

            string? clientSecret,

            string? clientid,

            ImmutableArray<string> credentialsUsedForExternalSynchronizations,

            string? passwordSecretName,

            string? pathToCredentials,

            string? roleid,

            string? secretid,

            string? tenantid,

            string? tokenSecretName,

            string? usernameSecretName,

            string? vaultNamespace,

            string? vaultUrl)
        {
            Certificate = certificate;
            ClientSecret = clientSecret;
            Clientid = clientid;
            CredentialsUsedForExternalSynchronizations = credentialsUsedForExternalSynchronizations;
            PasswordSecretName = passwordSecretName;
            PathToCredentials = pathToCredentials;
            Roleid = roleid;
            Secretid = secretid;
            Tenantid = tenantid;
            TokenSecretName = tokenSecretName;
            UsernameSecretName = usernameSecretName;
            VaultNamespace = vaultNamespace;
            VaultUrl = vaultUrl;
        }
    }
}
