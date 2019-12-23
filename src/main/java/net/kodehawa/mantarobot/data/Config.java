/*
 * Copyright (C) 2016-2019 David Alejandro Rubio Escares / Kodehawa
 *
 * Mantaro is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * Mantaro is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Mantaro.  If not, see http://www.gnu.org/licenses/
 *
 */

package net.kodehawa.mantarobot.data;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.kodehawa.mantarobot.commands.currency.seasons.Season;

import java.util.ArrayList;
import java.util.List;

public class Config {
    public String alClient;
    public String alsecret;
    public String apiLoginCreds;
    public boolean cacheGames = false;
    public String carbonToken;
    public String consoleChannel = "266231083341840385";
    public String dbDb = "mantaro";
    public String dbHost = "localhost";
    public String dbPassword;
    public int dbPort = 28015;
    public String dbUser;
    public String dbotsToken;
    public String dbotsorgToken;
    public boolean isBeta = false;
    public boolean isPremiumBot = false;
    public int maxJdaReconnectDelay = 3; //3 seconds
    public String osuApiKey;
    public List<String> owners = new ArrayList<>();
    public String[] prefix = {"~>", "->"};
    public String sentryDSN;
    public int shardWatcherTimeout = 1500; //wait 1500ms for the handlers to run
    public int shardWatcherWait = 600000; //run once every 600 seconds (10 minutes)
    public String shardWebhookUrl;
    public String token;
    public int totalShards = 0;
    public int fromShard = 0;
    public int upToShard = 0;
    public String weatherAppId;
    public String webhookUrl;
    public String spambotUrl;
    public String weebapiKey;
    public String apiTwoUrl = "http://127.0.0.1:5874";
    public boolean needApi = true;
    public int prometheusPort = 9091;
    public int ratelimitPoolSize = 4;
    public String apiAuthKey;
    public Season currentSeason = Season.FIRST;
    public String clientId; //why not ig.
    public String jedisPoolAddress = "127.0.0.1";
    public int jedisPoolPort = 6379;
    public List<String> lavalinkNodes = new ArrayList<>();
    public String lavalinkPass;
    public String cacheClientEndpoint;
    public String cacheClientToken;
    public String ipv6Block = "";
    public String excludeAddress = "";
    public int bucketFactor = 4;
    
    public Config() {
    }
    
    public boolean isOwner(Member member) {
        return isOwner(member.getUser());
    }

    public boolean isOwner(User user) {
        return isOwner(user.getId());
    }

    public boolean isOwner(String id) {
        return owners.contains(id);
    }
    
    public String getAlClient() {
        return this.alClient;
    }
    
    public String getAlsecret() {
        return this.alsecret;
    }
    
    public String getApiLoginCreds() {
        return this.apiLoginCreds;
    }
    
    public boolean isCacheGames() {
        return this.cacheGames;
    }
    
    public String getCarbonToken() {
        return this.carbonToken;
    }
    
    public String getConsoleChannel() {
        return this.consoleChannel;
    }
    
    public String getDbDb() {
        return this.dbDb;
    }
    
    public String getDbHost() {
        return this.dbHost;
    }
    
    public String getDbPassword() {
        return this.dbPassword;
    }
    
    public int getDbPort() {
        return this.dbPort;
    }
    
    public String getDbUser() {
        return this.dbUser;
    }
    
    public String getDbotsToken() {
        return this.dbotsToken;
    }
    
    public String getDbotsorgToken() {
        return this.dbotsorgToken;
    }
    
    public boolean isBeta() {
        return this.isBeta;
    }
    
    public boolean isPremiumBot() {
        return this.isPremiumBot;
    }
    
    public int getMaxJdaReconnectDelay() {
        return this.maxJdaReconnectDelay;
    }
    
    public String getOsuApiKey() {
        return this.osuApiKey;
    }
    
    public List<String> getOwners() {
        return this.owners;
    }
    
    public String[] getPrefix() {
        return this.prefix;
    }
    
    public String getSentryDSN() {
        return this.sentryDSN;
    }
    
    public int getShardWatcherTimeout() {
        return this.shardWatcherTimeout;
    }
    
    public int getShardWatcherWait() {
        return this.shardWatcherWait;
    }
    
    public String getShardWebhookUrl() {
        return this.shardWebhookUrl;
    }
    
    public String getToken() {
        return this.token;
    }
    
    public int getTotalShards() {
        return this.totalShards;
    }
    
    public int getFromShard() {
        return this.fromShard;
    }
    
    public int getUpToShard() {
        return this.upToShard;
    }
    
    public String getWeatherAppId() {
        return this.weatherAppId;
    }
    
    public String getWebhookUrl() {
        return this.webhookUrl;
    }
    
    public String getSpambotUrl() {
        return this.spambotUrl;
    }
    
    public String getWeebapiKey() {
        return this.weebapiKey;
    }
    
    public String getApiTwoUrl() {
        return this.apiTwoUrl;
    }
    
    public boolean isNeedApi() {
        return this.needApi;
    }
    
    public int getPrometheusPort() {
        return this.prometheusPort;
    }
    
    public int getRatelimitPoolSize() {
        return this.ratelimitPoolSize;
    }
    
    public String getApiAuthKey() {
        return this.apiAuthKey;
    }
    
    public Season getCurrentSeason() {
        return this.currentSeason;
    }
    
    public String getClientId() {
        return this.clientId;
    }
    
    public String getJedisPoolAddress() {
        return this.jedisPoolAddress;
    }
    
    public int getJedisPoolPort() {
        return this.jedisPoolPort;
    }
    
    public List<String> getLavalinkNodes() {
        return this.lavalinkNodes;
    }
    
    public String getLavalinkPass() {
        return this.lavalinkPass;
    }
    
    public String getCacheClientEndpoint() {
        return this.cacheClientEndpoint;
    }
    
    public String getCacheClientToken() {
        return this.cacheClientToken;
    }
    
    public String getIpv6Block() {
        return this.ipv6Block;
    }
    
    public String getExcludeAddress() {
        return this.excludeAddress;
    }
    
    public int getBucketFactor() {
        return this.bucketFactor;
    }
    
    public void setAlClient(String alClient) {
        this.alClient = alClient;
    }
    
    public void setAlsecret(String alsecret) {
        this.alsecret = alsecret;
    }
    
    public void setApiLoginCreds(String apiLoginCreds) {
        this.apiLoginCreds = apiLoginCreds;
    }
    
    public void setCacheGames(boolean cacheGames) {
        this.cacheGames = cacheGames;
    }
    
    public void setCarbonToken(String carbonToken) {
        this.carbonToken = carbonToken;
    }
    
    public void setConsoleChannel(String consoleChannel) {
        this.consoleChannel = consoleChannel;
    }
    
    public void setDbDb(String dbDb) {
        this.dbDb = dbDb;
    }
    
    public void setDbHost(String dbHost) {
        this.dbHost = dbHost;
    }
    
    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }
    
    public void setDbPort(int dbPort) {
        this.dbPort = dbPort;
    }
    
    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }
    
    public void setDbotsToken(String dbotsToken) {
        this.dbotsToken = dbotsToken;
    }
    
    public void setDbotsorgToken(String dbotsorgToken) {
        this.dbotsorgToken = dbotsorgToken;
    }
    
    public void setBeta(boolean isBeta) {
        this.isBeta = isBeta;
    }
    
    public void setPremiumBot(boolean isPremiumBot) {
        this.isPremiumBot = isPremiumBot;
    }
    
    public void setMaxJdaReconnectDelay(int maxJdaReconnectDelay) {
        this.maxJdaReconnectDelay = maxJdaReconnectDelay;
    }
    
    public void setOsuApiKey(String osuApiKey) {
        this.osuApiKey = osuApiKey;
    }
    
    public void setOwners(List<String> owners) {
        this.owners = owners;
    }
    
    public void setPrefix(String[] prefix) {
        this.prefix = prefix;
    }
    
    public void setSentryDSN(String sentryDSN) {
        this.sentryDSN = sentryDSN;
    }
    
    public void setShardWatcherTimeout(int shardWatcherTimeout) {
        this.shardWatcherTimeout = shardWatcherTimeout;
    }
    
    public void setShardWatcherWait(int shardWatcherWait) {
        this.shardWatcherWait = shardWatcherWait;
    }
    
    public void setShardWebhookUrl(String shardWebhookUrl) {
        this.shardWebhookUrl = shardWebhookUrl;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
    
    public void setTotalShards(int totalShards) {
        this.totalShards = totalShards;
    }
    
    public void setFromShard(int fromShard) {
        this.fromShard = fromShard;
    }
    
    public void setUpToShard(int upToShard) {
        this.upToShard = upToShard;
    }
    
    public void setWeatherAppId(String weatherAppId) {
        this.weatherAppId = weatherAppId;
    }
    
    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }
    
    public void setSpambotUrl(String spambotUrl) {
        this.spambotUrl = spambotUrl;
    }
    
    public void setWeebapiKey(String weebapiKey) {
        this.weebapiKey = weebapiKey;
    }
    
    public void setApiTwoUrl(String apiTwoUrl) {
        this.apiTwoUrl = apiTwoUrl;
    }
    
    public void setNeedApi(boolean needApi) {
        this.needApi = needApi;
    }
    
    public void setPrometheusPort(int prometheusPort) {
        this.prometheusPort = prometheusPort;
    }
    
    public void setRatelimitPoolSize(int ratelimitPoolSize) {
        this.ratelimitPoolSize = ratelimitPoolSize;
    }
    
    public void setApiAuthKey(String apiAuthKey) {
        this.apiAuthKey = apiAuthKey;
    }
    
    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }
    
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    
    public void setJedisPoolAddress(String jedisPoolAddress) {
        this.jedisPoolAddress = jedisPoolAddress;
    }
    
    public void setJedisPoolPort(int jedisPoolPort) {
        this.jedisPoolPort = jedisPoolPort;
    }
    
    public void setLavalinkNodes(List<String> lavalinkNodes) {
        this.lavalinkNodes = lavalinkNodes;
    }
    
    public void setLavalinkPass(String lavalinkPass) {
        this.lavalinkPass = lavalinkPass;
    }
    
    public void setCacheClientEndpoint(String cacheClientEndpoint) {
        this.cacheClientEndpoint = cacheClientEndpoint;
    }
    
    public void setCacheClientToken(String cacheClientToken) {
        this.cacheClientToken = cacheClientToken;
    }
    
    public void setIpv6Block(String ipv6Block) {
        this.ipv6Block = ipv6Block;
    }
    
    public void setExcludeAddress(String excludeAddress) {
        this.excludeAddress = excludeAddress;
    }
    
    public void setBucketFactor(int bucketFactor) {
        this.bucketFactor = bucketFactor;
    }
    
    public boolean equals(final Object o) {
        if(o == this) return true;
        if(!(o instanceof Config)) return false;
        final Config other = (Config) o;
        if(!other.canEqual((Object) this)) return false;
        final Object this$alClient = this.alClient;
        final Object other$alClient = other.alClient;
        if(this$alClient == null ? other$alClient != null : !this$alClient.equals(other$alClient)) return false;
        final Object this$alsecret = this.alsecret;
        final Object other$alsecret = other.alsecret;
        if(this$alsecret == null ? other$alsecret != null : !this$alsecret.equals(other$alsecret)) return false;
        final Object this$apiLoginCreds = this.apiLoginCreds;
        final Object other$apiLoginCreds = other.apiLoginCreds;
        if(this$apiLoginCreds == null ? other$apiLoginCreds != null : !this$apiLoginCreds.equals(other$apiLoginCreds))
            return false;
        if(this.cacheGames != other.cacheGames) return false;
        final Object this$carbonToken = this.carbonToken;
        final Object other$carbonToken = other.carbonToken;
        if(this$carbonToken == null ? other$carbonToken != null : !this$carbonToken.equals(other$carbonToken))
            return false;
        final Object this$consoleChannel = this.consoleChannel;
        final Object other$consoleChannel = other.consoleChannel;
        if(this$consoleChannel == null ? other$consoleChannel != null : !this$consoleChannel.equals(other$consoleChannel))
            return false;
        final Object this$dbDb = this.dbDb;
        final Object other$dbDb = other.dbDb;
        if(this$dbDb == null ? other$dbDb != null : !this$dbDb.equals(other$dbDb)) return false;
        final Object this$dbHost = this.dbHost;
        final Object other$dbHost = other.dbHost;
        if(this$dbHost == null ? other$dbHost != null : !this$dbHost.equals(other$dbHost)) return false;
        final Object this$dbPassword = this.dbPassword;
        final Object other$dbPassword = other.dbPassword;
        if(this$dbPassword == null ? other$dbPassword != null : !this$dbPassword.equals(other$dbPassword)) return false;
        if(this.dbPort != other.dbPort) return false;
        final Object this$dbUser = this.dbUser;
        final Object other$dbUser = other.dbUser;
        if(this$dbUser == null ? other$dbUser != null : !this$dbUser.equals(other$dbUser)) return false;
        final Object this$dbotsToken = this.dbotsToken;
        final Object other$dbotsToken = other.dbotsToken;
        if(this$dbotsToken == null ? other$dbotsToken != null : !this$dbotsToken.equals(other$dbotsToken)) return false;
        final Object this$dbotsorgToken = this.dbotsorgToken;
        final Object other$dbotsorgToken = other.dbotsorgToken;
        if(this$dbotsorgToken == null ? other$dbotsorgToken != null : !this$dbotsorgToken.equals(other$dbotsorgToken))
            return false;
        if(this.isBeta != other.isBeta) return false;
        if(this.isPremiumBot != other.isPremiumBot) return false;
        if(this.maxJdaReconnectDelay != other.maxJdaReconnectDelay) return false;
        final Object this$osuApiKey = this.osuApiKey;
        final Object other$osuApiKey = other.osuApiKey;
        if(this$osuApiKey == null ? other$osuApiKey != null : !this$osuApiKey.equals(other$osuApiKey)) return false;
        final Object this$owners = this.owners;
        final Object other$owners = other.owners;
        if(this$owners == null ? other$owners != null : !this$owners.equals(other$owners)) return false;
        if(!java.util.Arrays.deepEquals(this.prefix, other.prefix)) return false;
        final Object this$sentryDSN = this.sentryDSN;
        final Object other$sentryDSN = other.sentryDSN;
        if(this$sentryDSN == null ? other$sentryDSN != null : !this$sentryDSN.equals(other$sentryDSN)) return false;
        if(this.shardWatcherTimeout != other.shardWatcherTimeout) return false;
        if(this.shardWatcherWait != other.shardWatcherWait) return false;
        final Object this$shardWebhookUrl = this.shardWebhookUrl;
        final Object other$shardWebhookUrl = other.shardWebhookUrl;
        if(this$shardWebhookUrl == null ? other$shardWebhookUrl != null : !this$shardWebhookUrl.equals(other$shardWebhookUrl))
            return false;
        final Object this$token = this.token;
        final Object other$token = other.token;
        if(this$token == null ? other$token != null : !this$token.equals(other$token)) return false;
        if(this.totalShards != other.totalShards) return false;
        if(this.fromShard != other.fromShard) return false;
        if(this.upToShard != other.upToShard) return false;
        final Object this$weatherAppId = this.weatherAppId;
        final Object other$weatherAppId = other.weatherAppId;
        if(this$weatherAppId == null ? other$weatherAppId != null : !this$weatherAppId.equals(other$weatherAppId))
            return false;
        final Object this$webhookUrl = this.webhookUrl;
        final Object other$webhookUrl = other.webhookUrl;
        if(this$webhookUrl == null ? other$webhookUrl != null : !this$webhookUrl.equals(other$webhookUrl)) return false;
        final Object this$spambotUrl = this.spambotUrl;
        final Object other$spambotUrl = other.spambotUrl;
        if(this$spambotUrl == null ? other$spambotUrl != null : !this$spambotUrl.equals(other$spambotUrl)) return false;
        final Object this$weebapiKey = this.weebapiKey;
        final Object other$weebapiKey = other.weebapiKey;
        if(this$weebapiKey == null ? other$weebapiKey != null : !this$weebapiKey.equals(other$weebapiKey)) return false;
        final Object this$apiTwoUrl = this.apiTwoUrl;
        final Object other$apiTwoUrl = other.apiTwoUrl;
        if(this$apiTwoUrl == null ? other$apiTwoUrl != null : !this$apiTwoUrl.equals(other$apiTwoUrl)) return false;
        if(this.needApi != other.needApi) return false;
        if(this.prometheusPort != other.prometheusPort) return false;
        if(this.ratelimitPoolSize != other.ratelimitPoolSize) return false;
        final Object this$apiAuthKey = this.apiAuthKey;
        final Object other$apiAuthKey = other.apiAuthKey;
        if(this$apiAuthKey == null ? other$apiAuthKey != null : !this$apiAuthKey.equals(other$apiAuthKey)) return false;
        final Object this$currentSeason = this.currentSeason;
        final Object other$currentSeason = other.currentSeason;
        if(this$currentSeason == null ? other$currentSeason != null : !this$currentSeason.equals(other$currentSeason))
            return false;
        final Object this$clientId = this.clientId;
        final Object other$clientId = other.clientId;
        if(this$clientId == null ? other$clientId != null : !this$clientId.equals(other$clientId)) return false;
        final Object this$jedisPoolAddress = this.jedisPoolAddress;
        final Object other$jedisPoolAddress = other.jedisPoolAddress;
        if(this$jedisPoolAddress == null ? other$jedisPoolAddress != null : !this$jedisPoolAddress.equals(other$jedisPoolAddress))
            return false;
        if(this.jedisPoolPort != other.jedisPoolPort) return false;
        final Object this$lavalinkNodes = this.lavalinkNodes;
        final Object other$lavalinkNodes = other.lavalinkNodes;
        if(this$lavalinkNodes == null ? other$lavalinkNodes != null : !this$lavalinkNodes.equals(other$lavalinkNodes))
            return false;
        final Object this$lavalinkPass = this.lavalinkPass;
        final Object other$lavalinkPass = other.lavalinkPass;
        if(this$lavalinkPass == null ? other$lavalinkPass != null : !this$lavalinkPass.equals(other$lavalinkPass))
            return false;
        final Object this$cacheClientEndpoint = this.cacheClientEndpoint;
        final Object other$cacheClientEndpoint = other.cacheClientEndpoint;
        if(this$cacheClientEndpoint == null ? other$cacheClientEndpoint != null : !this$cacheClientEndpoint.equals(other$cacheClientEndpoint))
            return false;
        final Object this$cacheClientToken = this.cacheClientToken;
        final Object other$cacheClientToken = other.cacheClientToken;
        if(this$cacheClientToken == null ? other$cacheClientToken != null : !this$cacheClientToken.equals(other$cacheClientToken))
            return false;
        final Object this$ipv6Block = this.ipv6Block;
        final Object other$ipv6Block = other.ipv6Block;
        if(this$ipv6Block == null ? other$ipv6Block != null : !this$ipv6Block.equals(other$ipv6Block)) return false;
        final Object this$excludeAddress = this.excludeAddress;
        final Object other$excludeAddress = other.excludeAddress;
        if(this$excludeAddress == null ? other$excludeAddress != null : !this$excludeAddress.equals(other$excludeAddress))
            return false;
        if(this.bucketFactor != other.bucketFactor) return false;
        return true;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof Config;
    }
    
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $alClient = this.alClient;
        result = result * PRIME + ($alClient == null ? 43 : $alClient.hashCode());
        final Object $alsecret = this.alsecret;
        result = result * PRIME + ($alsecret == null ? 43 : $alsecret.hashCode());
        final Object $apiLoginCreds = this.apiLoginCreds;
        result = result * PRIME + ($apiLoginCreds == null ? 43 : $apiLoginCreds.hashCode());
        result = result * PRIME + (this.cacheGames ? 79 : 97);
        final Object $carbonToken = this.carbonToken;
        result = result * PRIME + ($carbonToken == null ? 43 : $carbonToken.hashCode());
        final Object $consoleChannel = this.consoleChannel;
        result = result * PRIME + ($consoleChannel == null ? 43 : $consoleChannel.hashCode());
        final Object $dbDb = this.dbDb;
        result = result * PRIME + ($dbDb == null ? 43 : $dbDb.hashCode());
        final Object $dbHost = this.dbHost;
        result = result * PRIME + ($dbHost == null ? 43 : $dbHost.hashCode());
        final Object $dbPassword = this.dbPassword;
        result = result * PRIME + ($dbPassword == null ? 43 : $dbPassword.hashCode());
        result = result * PRIME + this.dbPort;
        final Object $dbUser = this.dbUser;
        result = result * PRIME + ($dbUser == null ? 43 : $dbUser.hashCode());
        final Object $dbotsToken = this.dbotsToken;
        result = result * PRIME + ($dbotsToken == null ? 43 : $dbotsToken.hashCode());
        final Object $dbotsorgToken = this.dbotsorgToken;
        result = result * PRIME + ($dbotsorgToken == null ? 43 : $dbotsorgToken.hashCode());
        result = result * PRIME + (this.isBeta ? 79 : 97);
        result = result * PRIME + (this.isPremiumBot ? 79 : 97);
        result = result * PRIME + this.maxJdaReconnectDelay;
        final Object $osuApiKey = this.osuApiKey;
        result = result * PRIME + ($osuApiKey == null ? 43 : $osuApiKey.hashCode());
        final Object $owners = this.owners;
        result = result * PRIME + ($owners == null ? 43 : $owners.hashCode());
        result = result * PRIME + java.util.Arrays.deepHashCode(this.prefix);
        final Object $sentryDSN = this.sentryDSN;
        result = result * PRIME + ($sentryDSN == null ? 43 : $sentryDSN.hashCode());
        result = result * PRIME + this.shardWatcherTimeout;
        result = result * PRIME + this.shardWatcherWait;
        final Object $shardWebhookUrl = this.shardWebhookUrl;
        result = result * PRIME + ($shardWebhookUrl == null ? 43 : $shardWebhookUrl.hashCode());
        final Object $token = this.token;
        result = result * PRIME + ($token == null ? 43 : $token.hashCode());
        result = result * PRIME + this.totalShards;
        result = result * PRIME + this.fromShard;
        result = result * PRIME + this.upToShard;
        final Object $weatherAppId = this.weatherAppId;
        result = result * PRIME + ($weatherAppId == null ? 43 : $weatherAppId.hashCode());
        final Object $webhookUrl = this.webhookUrl;
        result = result * PRIME + ($webhookUrl == null ? 43 : $webhookUrl.hashCode());
        final Object $spambotUrl = this.spambotUrl;
        result = result * PRIME + ($spambotUrl == null ? 43 : $spambotUrl.hashCode());
        final Object $weebapiKey = this.weebapiKey;
        result = result * PRIME + ($weebapiKey == null ? 43 : $weebapiKey.hashCode());
        final Object $apiTwoUrl = this.apiTwoUrl;
        result = result * PRIME + ($apiTwoUrl == null ? 43 : $apiTwoUrl.hashCode());
        result = result * PRIME + (this.needApi ? 79 : 97);
        result = result * PRIME + this.prometheusPort;
        result = result * PRIME + this.ratelimitPoolSize;
        final Object $apiAuthKey = this.apiAuthKey;
        result = result * PRIME + ($apiAuthKey == null ? 43 : $apiAuthKey.hashCode());
        final Object $currentSeason = this.currentSeason;
        result = result * PRIME + ($currentSeason == null ? 43 : $currentSeason.hashCode());
        final Object $clientId = this.clientId;
        result = result * PRIME + ($clientId == null ? 43 : $clientId.hashCode());
        final Object $jedisPoolAddress = this.jedisPoolAddress;
        result = result * PRIME + ($jedisPoolAddress == null ? 43 : $jedisPoolAddress.hashCode());
        result = result * PRIME + this.jedisPoolPort;
        final Object $lavalinkNodes = this.lavalinkNodes;
        result = result * PRIME + ($lavalinkNodes == null ? 43 : $lavalinkNodes.hashCode());
        final Object $lavalinkPass = this.lavalinkPass;
        result = result * PRIME + ($lavalinkPass == null ? 43 : $lavalinkPass.hashCode());
        final Object $cacheClientEndpoint = this.cacheClientEndpoint;
        result = result * PRIME + ($cacheClientEndpoint == null ? 43 : $cacheClientEndpoint.hashCode());
        final Object $cacheClientToken = this.cacheClientToken;
        result = result * PRIME + ($cacheClientToken == null ? 43 : $cacheClientToken.hashCode());
        final Object $ipv6Block = this.ipv6Block;
        result = result * PRIME + ($ipv6Block == null ? 43 : $ipv6Block.hashCode());
        final Object $excludeAddress = this.excludeAddress;
        result = result * PRIME + ($excludeAddress == null ? 43 : $excludeAddress.hashCode());
        result = result * PRIME + this.bucketFactor;
        return result;
    }
    
    public String toString() {
        return "Config(alClient=" + this.alClient + ", alsecret=" + this.alsecret + ", apiLoginCreds=" + this.apiLoginCreds + ", cacheGames=" + this.cacheGames + ", carbonToken=" + this.carbonToken + ", consoleChannel=" + this.consoleChannel + ", dbDb=" + this.dbDb + ", dbHost=" + this.dbHost + ", dbPassword=" + this.dbPassword + ", dbPort=" + this.dbPort + ", dbUser=" + this.dbUser + ", dbotsToken=" + this.dbotsToken + ", dbotsorgToken=" + this.dbotsorgToken + ", isBeta=" + this.isBeta + ", isPremiumBot=" + this.isPremiumBot + ", maxJdaReconnectDelay=" + this.maxJdaReconnectDelay + ", osuApiKey=" + this.osuApiKey + ", owners=" + this.owners + ", prefix=" + java.util.Arrays.deepToString(this.prefix) + ", sentryDSN=" + this.sentryDSN + ", shardWatcherTimeout=" + this.shardWatcherTimeout + ", shardWatcherWait=" + this.shardWatcherWait + ", shardWebhookUrl=" + this.shardWebhookUrl + ", token=" + this.token + ", totalShards=" + this.totalShards + ", fromShard=" + this.fromShard + ", upToShard=" + this.upToShard + ", weatherAppId=" + this.weatherAppId + ", webhookUrl=" + this.webhookUrl + ", spambotUrl=" + this.spambotUrl + ", weebapiKey=" + this.weebapiKey + ", apiTwoUrl=" + this.apiTwoUrl + ", needApi=" + this.needApi + ", prometheusPort=" + this.prometheusPort + ", ratelimitPoolSize=" + this.ratelimitPoolSize + ", apiAuthKey=" + this.apiAuthKey + ", currentSeason=" + this.currentSeason + ", clientId=" + this.clientId + ", jedisPoolAddress=" + this.jedisPoolAddress + ", jedisPoolPort=" + this.jedisPoolPort + ", lavalinkNodes=" + this.lavalinkNodes + ", lavalinkPass=" + this.lavalinkPass + ", cacheClientEndpoint=" + this.cacheClientEndpoint + ", cacheClientToken=" + this.cacheClientToken + ", ipv6Block=" + this.ipv6Block + ", excludeAddress=" + this.excludeAddress + ", bucketFactor=" + this.bucketFactor + ")";
    }
}
