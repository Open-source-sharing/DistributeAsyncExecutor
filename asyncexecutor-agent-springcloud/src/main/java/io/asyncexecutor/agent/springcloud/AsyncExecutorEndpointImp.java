package io.asyncexecutor.agent.springcloud;

import io.asyncexecutor.agent.api.AsyncExecutorEndpoint;
import io.asyncexecutor.context.SubmitAsyncTaskResponse;
import io.asyncexecutor.context.dto.*;

import java.util.concurrent.ExecutorService;

public class AsyncExecutorEndpointImp implements AsyncExecutorEndpoint {
    @Override
    public ExecutorService executorService() {
        return null;
    }

    @Override
    public SubmitAsyncTaskResponse submitAsyncTask(SubmitAsyncTaskRequest request) {
        return null;
    }

    @Override
    public PerformStageResponse performStage(PerformStageRequest request) {
        return null;
    }

    @Override
    public DescribeStageOutResponse describeStageOut(DescribeStageOutRequest request) {
        return null;
    }

    @Override
    public CallbackOnSuccessResponse callbackOnSuccess(CallbackOnSuccessRequest request) {
        return null;
    }

    @Override
    public CallbackOnErrorResponse callbackOnFailed(CallbackOnErrorRequest request) {
        return null;
    }
}
