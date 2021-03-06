/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/CreateDeliveryStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeliveryStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the delivery stream. This name must be unique per AWS account in the same region. If the delivery
     * streams are in different accounts or different regions, you can have multiple delivery streams with the same
     * name.
     * </p>
     */
    private String deliveryStreamName;
    /**
     * <p>
     * The delivery stream type. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DirectPut</code>: Provider applications access the delivery stream directly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis stream as a source.
     * </p>
     * </li>
     * </ul>
     */
    private String deliveryStreamType;
    /**
     * <p>
     * When a Kinesis stream is used as the source for the delivery stream, a <a>KinesisStreamSourceConfiguration</a>
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     * </p>
     */
    private KinesisStreamSourceConfiguration kinesisStreamSourceConfiguration;
    /**
     * <p>
     * [Deprecated] The destination in Amazon S3. You can specify only one destination.
     * </p>
     */
    @Deprecated
    private S3DestinationConfiguration s3DestinationConfiguration;
    /**
     * <p>
     * The destination in Amazon S3. You can specify only one destination.
     * </p>
     */
    private ExtendedS3DestinationConfiguration extendedS3DestinationConfiguration;
    /**
     * <p>
     * The destination in Amazon Redshift. You can specify only one destination.
     * </p>
     */
    private RedshiftDestinationConfiguration redshiftDestinationConfiguration;
    /**
     * <p>
     * The destination in Amazon ES. You can specify only one destination.
     * </p>
     */
    private ElasticsearchDestinationConfiguration elasticsearchDestinationConfiguration;

    /**
     * <p>
     * The name of the delivery stream. This name must be unique per AWS account in the same region. If the delivery
     * streams are in different accounts or different regions, you can have multiple delivery streams with the same
     * name.
     * </p>
     * 
     * @param deliveryStreamName
     *        The name of the delivery stream. This name must be unique per AWS account in the same region. If the
     *        delivery streams are in different accounts or different regions, you can have multiple delivery streams
     *        with the same name.
     */

    public void setDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream. This name must be unique per AWS account in the same region. If the delivery
     * streams are in different accounts or different regions, you can have multiple delivery streams with the same
     * name.
     * </p>
     * 
     * @return The name of the delivery stream. This name must be unique per AWS account in the same region. If the
     *         delivery streams are in different accounts or different regions, you can have multiple delivery streams
     *         with the same name.
     */

    public String getDeliveryStreamName() {
        return this.deliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream. This name must be unique per AWS account in the same region. If the delivery
     * streams are in different accounts or different regions, you can have multiple delivery streams with the same
     * name.
     * </p>
     * 
     * @param deliveryStreamName
     *        The name of the delivery stream. This name must be unique per AWS account in the same region. If the
     *        delivery streams are in different accounts or different regions, you can have multiple delivery streams
     *        with the same name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliveryStreamRequest withDeliveryStreamName(String deliveryStreamName) {
        setDeliveryStreamName(deliveryStreamName);
        return this;
    }

    /**
     * <p>
     * The delivery stream type. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DirectPut</code>: Provider applications access the delivery stream directly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis stream as a source.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliveryStreamType
     *        The delivery stream type. This parameter can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DirectPut</code>: Provider applications access the delivery stream directly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis stream as a source.
     *        </p>
     *        </li>
     * @see DeliveryStreamType
     */

    public void setDeliveryStreamType(String deliveryStreamType) {
        this.deliveryStreamType = deliveryStreamType;
    }

    /**
     * <p>
     * The delivery stream type. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DirectPut</code>: Provider applications access the delivery stream directly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis stream as a source.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The delivery stream type. This parameter can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DirectPut</code>: Provider applications access the delivery stream directly.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis stream as a source.
     *         </p>
     *         </li>
     * @see DeliveryStreamType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("deliveryStreamType")
    public String getDeliveryStreamType() {
        return this.deliveryStreamType;
    }

    /**
     * <p>
     * The delivery stream type. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DirectPut</code>: Provider applications access the delivery stream directly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis stream as a source.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliveryStreamType
     *        The delivery stream type. This parameter can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DirectPut</code>: Provider applications access the delivery stream directly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis stream as a source.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStreamType
     */

    public CreateDeliveryStreamRequest withDeliveryStreamType(String deliveryStreamType) {
        setDeliveryStreamType(deliveryStreamType);
        return this;
    }

    /**
     * <p>
     * The delivery stream type. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DirectPut</code>: Provider applications access the delivery stream directly.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis stream as a source.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deliveryStreamType
     *        The delivery stream type. This parameter can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DirectPut</code>: Provider applications access the delivery stream directly.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KinesisStreamAsSource</code>: The delivery stream uses a Kinesis stream as a source.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStreamType
     */

    public CreateDeliveryStreamRequest withDeliveryStreamType(DeliveryStreamType deliveryStreamType) {
        this.deliveryStreamType = deliveryStreamType.toString();
        return this;
    }

    /**
     * <p>
     * When a Kinesis stream is used as the source for the delivery stream, a <a>KinesisStreamSourceConfiguration</a>
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     * </p>
     * 
     * @param kinesisStreamSourceConfiguration
     *        When a Kinesis stream is used as the source for the delivery stream, a
     *        <a>KinesisStreamSourceConfiguration</a> containing the Kinesis stream ARN and the role ARN for the source
     *        stream.
     */

    public void setKinesisStreamSourceConfiguration(KinesisStreamSourceConfiguration kinesisStreamSourceConfiguration) {
        this.kinesisStreamSourceConfiguration = kinesisStreamSourceConfiguration;
    }

    /**
     * <p>
     * When a Kinesis stream is used as the source for the delivery stream, a <a>KinesisStreamSourceConfiguration</a>
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     * </p>
     * 
     * @return When a Kinesis stream is used as the source for the delivery stream, a
     *         <a>KinesisStreamSourceConfiguration</a> containing the Kinesis stream ARN and the role ARN for the source
     *         stream.
     */

    public KinesisStreamSourceConfiguration getKinesisStreamSourceConfiguration() {
        return this.kinesisStreamSourceConfiguration;
    }

    /**
     * <p>
     * When a Kinesis stream is used as the source for the delivery stream, a <a>KinesisStreamSourceConfiguration</a>
     * containing the Kinesis stream ARN and the role ARN for the source stream.
     * </p>
     * 
     * @param kinesisStreamSourceConfiguration
     *        When a Kinesis stream is used as the source for the delivery stream, a
     *        <a>KinesisStreamSourceConfiguration</a> containing the Kinesis stream ARN and the role ARN for the source
     *        stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliveryStreamRequest withKinesisStreamSourceConfiguration(KinesisStreamSourceConfiguration kinesisStreamSourceConfiguration) {
        setKinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration);
        return this;
    }

    /**
     * <p>
     * [Deprecated] The destination in Amazon S3. You can specify only one destination.
     * </p>
     * 
     * @param s3DestinationConfiguration
     *        [Deprecated] The destination in Amazon S3. You can specify only one destination.
     */
    @Deprecated
    public void setS3DestinationConfiguration(S3DestinationConfiguration s3DestinationConfiguration) {
        this.s3DestinationConfiguration = s3DestinationConfiguration;
    }

    /**
     * <p>
     * [Deprecated] The destination in Amazon S3. You can specify only one destination.
     * </p>
     * 
     * @return [Deprecated] The destination in Amazon S3. You can specify only one destination.
     */
    @Deprecated
    public S3DestinationConfiguration getS3DestinationConfiguration() {
        return this.s3DestinationConfiguration;
    }

    /**
     * <p>
     * [Deprecated] The destination in Amazon S3. You can specify only one destination.
     * </p>
     * 
     * @param s3DestinationConfiguration
     *        [Deprecated] The destination in Amazon S3. You can specify only one destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public CreateDeliveryStreamRequest withS3DestinationConfiguration(S3DestinationConfiguration s3DestinationConfiguration) {
        setS3DestinationConfiguration(s3DestinationConfiguration);
        return this;
    }

    /**
     * <p>
     * The destination in Amazon S3. You can specify only one destination.
     * </p>
     * 
     * @param extendedS3DestinationConfiguration
     *        The destination in Amazon S3. You can specify only one destination.
     */

    public void setExtendedS3DestinationConfiguration(ExtendedS3DestinationConfiguration extendedS3DestinationConfiguration) {
        this.extendedS3DestinationConfiguration = extendedS3DestinationConfiguration;
    }

    /**
     * <p>
     * The destination in Amazon S3. You can specify only one destination.
     * </p>
     * 
     * @return The destination in Amazon S3. You can specify only one destination.
     */

    public ExtendedS3DestinationConfiguration getExtendedS3DestinationConfiguration() {
        return this.extendedS3DestinationConfiguration;
    }

    /**
     * <p>
     * The destination in Amazon S3. You can specify only one destination.
     * </p>
     * 
     * @param extendedS3DestinationConfiguration
     *        The destination in Amazon S3. You can specify only one destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliveryStreamRequest withExtendedS3DestinationConfiguration(ExtendedS3DestinationConfiguration extendedS3DestinationConfiguration) {
        setExtendedS3DestinationConfiguration(extendedS3DestinationConfiguration);
        return this;
    }

    /**
     * <p>
     * The destination in Amazon Redshift. You can specify only one destination.
     * </p>
     * 
     * @param redshiftDestinationConfiguration
     *        The destination in Amazon Redshift. You can specify only one destination.
     */

    public void setRedshiftDestinationConfiguration(RedshiftDestinationConfiguration redshiftDestinationConfiguration) {
        this.redshiftDestinationConfiguration = redshiftDestinationConfiguration;
    }

    /**
     * <p>
     * The destination in Amazon Redshift. You can specify only one destination.
     * </p>
     * 
     * @return The destination in Amazon Redshift. You can specify only one destination.
     */

    public RedshiftDestinationConfiguration getRedshiftDestinationConfiguration() {
        return this.redshiftDestinationConfiguration;
    }

    /**
     * <p>
     * The destination in Amazon Redshift. You can specify only one destination.
     * </p>
     * 
     * @param redshiftDestinationConfiguration
     *        The destination in Amazon Redshift. You can specify only one destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliveryStreamRequest withRedshiftDestinationConfiguration(RedshiftDestinationConfiguration redshiftDestinationConfiguration) {
        setRedshiftDestinationConfiguration(redshiftDestinationConfiguration);
        return this;
    }

    /**
     * <p>
     * The destination in Amazon ES. You can specify only one destination.
     * </p>
     * 
     * @param elasticsearchDestinationConfiguration
     *        The destination in Amazon ES. You can specify only one destination.
     */

    public void setElasticsearchDestinationConfiguration(ElasticsearchDestinationConfiguration elasticsearchDestinationConfiguration) {
        this.elasticsearchDestinationConfiguration = elasticsearchDestinationConfiguration;
    }

    /**
     * <p>
     * The destination in Amazon ES. You can specify only one destination.
     * </p>
     * 
     * @return The destination in Amazon ES. You can specify only one destination.
     */

    public ElasticsearchDestinationConfiguration getElasticsearchDestinationConfiguration() {
        return this.elasticsearchDestinationConfiguration;
    }

    /**
     * <p>
     * The destination in Amazon ES. You can specify only one destination.
     * </p>
     * 
     * @param elasticsearchDestinationConfiguration
     *        The destination in Amazon ES. You can specify only one destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeliveryStreamRequest withElasticsearchDestinationConfiguration(ElasticsearchDestinationConfiguration elasticsearchDestinationConfiguration) {
        setElasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeliveryStreamName() != null)
            sb.append("DeliveryStreamName: ").append(getDeliveryStreamName()).append(",");
        if (getDeliveryStreamType() != null)
            sb.append("DeliveryStreamType: ").append(getDeliveryStreamType()).append(",");
        if (getKinesisStreamSourceConfiguration() != null)
            sb.append("KinesisStreamSourceConfiguration: ").append(getKinesisStreamSourceConfiguration()).append(",");
        if (getS3DestinationConfiguration() != null)
            sb.append("S3DestinationConfiguration: ").append(getS3DestinationConfiguration()).append(",");
        if (getExtendedS3DestinationConfiguration() != null)
            sb.append("ExtendedS3DestinationConfiguration: ").append(getExtendedS3DestinationConfiguration()).append(",");
        if (getRedshiftDestinationConfiguration() != null)
            sb.append("RedshiftDestinationConfiguration: ").append(getRedshiftDestinationConfiguration()).append(",");
        if (getElasticsearchDestinationConfiguration() != null)
            sb.append("ElasticsearchDestinationConfiguration: ").append(getElasticsearchDestinationConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeliveryStreamRequest == false)
            return false;
        CreateDeliveryStreamRequest other = (CreateDeliveryStreamRequest) obj;
        if (other.getDeliveryStreamName() == null ^ this.getDeliveryStreamName() == null)
            return false;
        if (other.getDeliveryStreamName() != null && other.getDeliveryStreamName().equals(this.getDeliveryStreamName()) == false)
            return false;
        if (other.getDeliveryStreamType() == null ^ this.getDeliveryStreamType() == null)
            return false;
        if (other.getDeliveryStreamType() != null && other.getDeliveryStreamType().equals(this.getDeliveryStreamType()) == false)
            return false;
        if (other.getKinesisStreamSourceConfiguration() == null ^ this.getKinesisStreamSourceConfiguration() == null)
            return false;
        if (other.getKinesisStreamSourceConfiguration() != null
                && other.getKinesisStreamSourceConfiguration().equals(this.getKinesisStreamSourceConfiguration()) == false)
            return false;
        if (other.getS3DestinationConfiguration() == null ^ this.getS3DestinationConfiguration() == null)
            return false;
        if (other.getS3DestinationConfiguration() != null && other.getS3DestinationConfiguration().equals(this.getS3DestinationConfiguration()) == false)
            return false;
        if (other.getExtendedS3DestinationConfiguration() == null ^ this.getExtendedS3DestinationConfiguration() == null)
            return false;
        if (other.getExtendedS3DestinationConfiguration() != null
                && other.getExtendedS3DestinationConfiguration().equals(this.getExtendedS3DestinationConfiguration()) == false)
            return false;
        if (other.getRedshiftDestinationConfiguration() == null ^ this.getRedshiftDestinationConfiguration() == null)
            return false;
        if (other.getRedshiftDestinationConfiguration() != null
                && other.getRedshiftDestinationConfiguration().equals(this.getRedshiftDestinationConfiguration()) == false)
            return false;
        if (other.getElasticsearchDestinationConfiguration() == null ^ this.getElasticsearchDestinationConfiguration() == null)
            return false;
        if (other.getElasticsearchDestinationConfiguration() != null
                && other.getElasticsearchDestinationConfiguration().equals(this.getElasticsearchDestinationConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryStreamName() == null) ? 0 : getDeliveryStreamName().hashCode());
        hashCode = prime * hashCode + ((getDeliveryStreamType() == null) ? 0 : getDeliveryStreamType().hashCode());
        hashCode = prime * hashCode + ((getKinesisStreamSourceConfiguration() == null) ? 0 : getKinesisStreamSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getS3DestinationConfiguration() == null) ? 0 : getS3DestinationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getExtendedS3DestinationConfiguration() == null) ? 0 : getExtendedS3DestinationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRedshiftDestinationConfiguration() == null) ? 0 : getRedshiftDestinationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getElasticsearchDestinationConfiguration() == null) ? 0 : getElasticsearchDestinationConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeliveryStreamRequest clone() {
        return (CreateDeliveryStreamRequest) super.clone();
    }

}
