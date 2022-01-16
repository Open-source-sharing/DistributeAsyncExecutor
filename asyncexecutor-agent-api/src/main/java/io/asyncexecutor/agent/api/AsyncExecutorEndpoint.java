package io.asyncexecutor.agent.api;

import io.asyncexecutor.context.SubmitAsyncTaskResponse;
import io.asyncexecutor.context.dto.*;

import java.util.concurrent.ExecutorService;

public interface AsyncExecutorEndpoint {

    ExecutorService executorService();

    @Endpoint
    SubmitAsyncTaskResponse submitAsyncTask(SubmitAsyncTaskRequest request);

    @Endpoint
    PerformStageResponse performStage(PerformStageRequest request);

    @Endpoint
    DescribeStageOutResponse describeStageOut(DescribeStageOutRequest request);

    @Endpoint
    CallbackOnSuccessResponse callbackOnSuccess(CallbackOnSuccessRequest request);

    @Endpoint
    CallbackOnErrorResponse callbackOnFailed(CallbackOnErrorRequest request);

}
