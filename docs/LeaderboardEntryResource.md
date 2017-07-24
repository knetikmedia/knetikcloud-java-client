
# LeaderboardEntryResource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rank** | **Long** | The position of the user in the leaderboard. Null means non-compete or disqualification |  [optional]
**score** | **Long** | The raw score in this leaderboard. Null means non-compete or disqualification |  [optional]
**updatedDate** | **Long** | The date this score was recorded or updated. Unix timestamp in seconds |  [optional]
**user** | [**SimpleUserResource**](SimpleUserResource.md) | The player for this entry | 



