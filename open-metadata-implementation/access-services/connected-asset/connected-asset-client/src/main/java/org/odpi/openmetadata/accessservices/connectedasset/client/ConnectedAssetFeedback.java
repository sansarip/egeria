/* SPDX-License-Identifier: Apache 2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.accessservices.connectedasset.client;


import org.odpi.openmetadata.frameworks.connectors.properties.AssetFeedback;

/**
 * ConnectedAssetFeedback provides the open metadata extension to the Open Connector Framework (OCF)'s AssetFeedback
 * class that returned the comments, tags, likes and ratings associated with an asset.
 */
public class ConnectedAssetFeedback extends AssetFeedback
{
    private String              serverName;
    private String              userId;
    private String              omasServerURL;
    private String              assetGUID;
    private ConnectedAsset      connectedAsset;
    private int                 maxCacheSize;


    /**
     * Typical constructor creates an AssetFeedback object primed with the iterators for the asset's comments,
     * tags, likes and ratings.
     *
     * @param serverName name of server to use on server calls.
     * @param userId user id to use on server calls.
     * @param omasServerURL url root of the server to use.
     * @param assetGUID unique identifier of the asset.
     * @param parentAsset descriptor of parent asset.
     * @param commentCount the total number of comments to process.  A negative value is converted to 0.
     * @param likeCount the total number of likes to process.  A negative value is converted to 0.
     * @param ratingCount the total number of ratings to process.  A negative value is converted to 0.
     * @param tagCount the total number of comments to process.  A negative value is converted to 0.
     * @param maxCacheSize maximum number of elements that should be retrieved from the property server and
     *                     cached in the element list at any one time.  If a number less than one is supplied, 1 is used.
     */
    ConnectedAssetFeedback(String              serverName,
                           String              userId,
                           String              omasServerURL,
                           String              assetGUID,
                           ConnectedAsset      parentAsset,
                           int                 commentCount,
                           int                 likeCount,
                           int                 ratingCount,
                           int                 tagCount,
                           int                 maxCacheSize)
    {
        super(parentAsset);

        this.serverName      = serverName;
        this.userId          = userId;
        this.omasServerURL   = omasServerURL;
        this.assetGUID       = assetGUID;
        this.connectedAsset  = parentAsset;
        this.maxCacheSize    = maxCacheSize;


        if (commentCount > 0)
        {
            super.comments = new ConnectedAssetComments(serverName,
                                                        userId,
                                                        omasServerURL,
                                                        assetGUID,
                                                        parentAsset,
                                                        commentCount,
                                                        maxCacheSize);
        }


        if (likeCount > 0)
        {
            super.likes = new ConnectedAssetLikes(serverName,
                                                  userId,
                                                  omasServerURL,
                                                  assetGUID,
                                                  parentAsset,
                                                  likeCount,
                                                  maxCacheSize);
        }

        if (ratingCount > 0)
        {
            super.ratings = new ConnectedAssetRatings(serverName,
                                                      userId,
                                                      omasServerURL,
                                                      assetGUID,
                                                      parentAsset,
                                                      ratingCount,
                                                      maxCacheSize);
        }

        if (tagCount > 0)
        {
            super.informalTags = new ConnectedAssetInformalTags(serverName,
                                                                userId,
                                                                omasServerURL,
                                                                assetGUID,
                                                                parentAsset,
                                                                tagCount,
                                                                maxCacheSize);
        }
    }
}
